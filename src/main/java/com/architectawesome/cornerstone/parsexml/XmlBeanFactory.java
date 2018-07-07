package com.architectawesome.cornerstone.parsexml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by renwujie on 2018/07/02 at 10:10
 * <p>
 * XmlBeanFactory
 */
public class XmlBeanFactory {
    private String xmlName;
    private SAXReader reader;
    private Document document;

    public XmlBeanFactory(String xmlName) {
        try {
            this.xmlName = xmlName;
            reader = new SAXReader();
            document = reader.read(this.getClass().getClassLoader().getResourceAsStream(xmlName));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public <T> List<T> getBeanOfType(Class<T> type) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        List<T> objects = new ArrayList<>();
        Element root = document.getRootElement();
        List<Element> beans = root.elements();
        if (beans.size() > 0) {
            for (Element bean : beans) {
                if (bean.attributeValue("class").equals(type.getName())) {
                    T object = null;
                    String clazz = bean.attributeValue("class");
                    //通过反射来创建对象
                    Class beanClass = Class.forName("class");
                    object = (T) beanClass.newInstance();

                    List<Element> properties = bean.elements();
                    if (properties.size() > 0) {
                        for (Element property : properties) {
                            String key = property.attributeValue("name");
                            Field field = beanClass.getDeclaredField(key);
                            field.setAccessible(true);

                            List<Element> childBean = property.elements();

                            //如果property下内嵌bean
                            if (childBean.size() > 0) {
                                Object childObject = getBean(key, property);
                                field.set(object, childObject);
                            } else {
                                /*
                                     * 此属性值是一个字符串.这里单独处理int,float类型变量.如果不处理,
                                     * 会将String类型直接赋值给int类型,发生ClassCastException
                                     */
                                String value = property.attributeValue("value");

                                // 需要对类型进行判断
                                if (field.getType().getName().equals("int")) {
                                    // 整数
                                    int x = Integer.parseInt(value);
                                    field.set(object, x);
                                    continue;
                                }
                                if (field.getType().getName().equals("float")) {
                                    // 浮点数
                                    float y = Float.parseFloat(value);
                                    field.set(object, y); // 注意double可以接受float类型
                                    continue;
                                }
                                field.set(object, value);// 处理String类型
                            }
                        }
                    }
                    objects.add(object);
                }
            }
        }
        return objects;
    }


    public Object getBean(String name, Element root) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Object object = null;
        List<Element> beans = root.elements();
        if (beans.size() > 0) {
            for (Element bean : beans) {
                if (bean.attributeValue("name").equals(name)) {
                    // 如果bean name相同则开始创建对象
                    String clazz = bean.attributeValue("class");
                    //通过反射创建对象
                    Class beanClass = Class.forName(clazz);
                    object = beanClass.newInstance();

                    List<Element> properties = bean.elements();

                    if (properties.size() > 0) {
                        for (Element property : properties) {
                            String key = property.attributeValue("name");
                            Field field = beanClass.getDeclaredField(key);
                            field.setAccessible(true);


                            List<Element> childBean = property.elements();
                            //如果property下内嵌bean
                            if (childBean.size() > 0) {
                                field.set(object, getBean(key, property));
                            }

                            if (property.attribute("ref") != null) {
                                String refid = property.attributeValue("ref");
                                field.set(object, this.getBean(refid, property));
                            } else {
                                /*
                                 * 此属性值是一个字符串.这里单独处理int,float类型变量.如果不处理,会将String类型直接赋值给int类型,
                                 * 发生ClassCastException
                                 */
                                String value = property.attributeValue("value");
                                // 需要对类型进行判断
                                field.set(object, value);// 处理String类型
                            }

                        }
                    }
                }
            }
        }

        return object;
    }

}

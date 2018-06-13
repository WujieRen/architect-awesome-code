package com.architectawesome.cornerstone.reflection;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by renwujie on 2018/06/13 at 9:25
 */
public class TestReflect1 implements Serializable {
    private String name;
    private int age;

    public TestReflect1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 通过getReadMethod()调用类的get方法，通过getWriteMethod()调用类的set()。
     * 通常来说，不需要使用反射工具，但是它们在创建动态代码时会很有用，反射在代码中用来支持其他特性的，如对象的序列化和JavaBean等。
     * @param args
     * @throws IntrospectionException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public static void main(String[] args) throws IntrospectionException, InvocationTargetException, IllegalAccessException {
        TestReflect1 person = new TestReflect1("luoxn28", 23);
        Class clazz = person.getClass();

        //Field[] fields = clazz.getFields();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields) {
            String key = field.getName();
            PropertyDescriptor descriptor = new PropertyDescriptor(key, clazz);
            Method method = descriptor.getReadMethod();
            Object value = method.invoke(person);

            System.out.println(key + " : " + value);
        }
    }
}

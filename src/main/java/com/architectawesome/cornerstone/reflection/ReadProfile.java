package com.architectawesome.cornerstone.reflection;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by renwujie on 2018/06/13 at 18:37
 */
public class ReadProfile {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IOException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName(getValue("className"));

        Method method = clazz.getMethod(getValue("methodName"), String.class);
        method.invoke(clazz.getConstructor().newInstance(), "任武杰");
    }

    public static String getValue(String key) throws IOException {
        //获取配置文件对象
        Properties pro = new Properties();
        //获取输入流
        FileReader in = new FileReader("E:\\WorkSpaceIDEA\\architectAwesome\\src\\main\\resources\\property.txt");
        //将流加载到配置文件对象中
        pro.load(in);
        //关闭流
        in.close();
        //根据key获取值
        return pro.getProperty(key);
    }
}

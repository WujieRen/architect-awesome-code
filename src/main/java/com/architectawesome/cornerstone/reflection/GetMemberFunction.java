package com.architectawesome.cornerstone.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by renwujie on 2018/06/13 at 18:12
 */
public class GetMemberFunction {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class psnClass = Class.forName("com.architectawesome.cornerstone.reflection.Person");

        //2.获取所有公有方法
        System.out.println("***************获取所有的”公有“方法*******************");
        psnClass.getMethods();
        Method[] methodArray = psnClass.getMethods();
        for(Method m : methodArray){
            System.out.println(m);
        }

        System.out.println("***************获取所有的方法，包括私有的*******************");
        methodArray = psnClass.getDeclaredMethods();
        for(Method m : methodArray){
            System.out.println(m);
        }

        System.out.println("***************获取公有的show1()方法*******************");
        Method method = psnClass.getMethod("show1", String.class);
        System.out.println(method);
        //实例化一个Student对象
        Object obj = psnClass.getConstructor().newInstance();
        method.invoke(obj, "刘德华");

        System.out.println("***************获取私有的show4()方法******************");
        method = psnClass.getDeclaredMethod("show4", int.class);
        System.out.println(method);
        method.setAccessible(true);//解除私有限定
        Object result = method.invoke(obj, 20);//需要两个参数，一个是要调用的对象（获取有反射），一个是实参
        System.out.println("返回值：" + result);
    }
}

package com.architectawesome.cornerstone.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by renwujie on 2018/06/13 at 17:48
 */
public class GetMemberField {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class psnClass = Class.forName("com.architectawesome.cornerstone.reflection.Person");

        //2.获取字段
        System.out.println("************获取所有公有的字段********************");
        Field[] fieldArray = psnClass.getFields();
        for(Field f : fieldArray){
            System.out.println(f);
        }

        System.out.println("************获取所有的字段(包括私有、受保护、默认的)********************");
        fieldArray = psnClass.getDeclaredFields();
        for(Field f : fieldArray){
            System.out.println(f);
        }

        System.out.println("*************获取公有字段**并调用***********************************");
        Field field = psnClass.getField("name");
        System.out.println(field);
        //获取一个对象
        Object obj = psnClass.getConstructor().newInstance();//产生Student对象--》Student stu = new Student();
        //为字段设置值
        field.set(obj, "任武杰");
        //验证
        Person person = (Person) obj;
        System.out.println("验证姓名：" + person.name);

        System.out.println("**************获取私有字段****并调用********************************");
        field = psnClass.getDeclaredField("phoneNum");
        System.out.println(field);
        field.setAccessible(true);//暴力反射，解除私有限定
        field.set(obj, "18888889999");
        System.out.println("验证电话：" + field);
    }
}

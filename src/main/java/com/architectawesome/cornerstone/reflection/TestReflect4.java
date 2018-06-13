package com.architectawesome.cornerstone.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by renwujie on 2018/06/13 at 10:42
 */
public class TestReflect4 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException {
        Class<?> c = MethodClass.class;
        Object object = c.newInstance();
        Method[] methods = c.getMethods();
        Method[] declaredMethods = c.getDeclaredMethods();
        //获取MethodClass的add()
        Method method = c.getMethod("add", String.class, int.class);
        System.out.println(method);
       //getMethods()获取所有方法
        System.out.println("getMethods获取的方法：");
        for(Method m : methods) {
            System.out.println(m);
        }
        //getDeclaredMethods()方法获取的所有方法
        System.out.println("getDeclaredMethods获取的方法：");
        for(Method m : declaredMethods) {
            System.out.println(m);
        }

        System.out.println("获取构造器：");
        Constructor[] constructors = c.getConstructors();
        for(Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
}

class MethodClass{
    public final int fuck = 3;
    private int name;

    public MethodClass() {
    }

    private MethodClass(int name) {
        this.name = name;
    }

    public int add(int a, int b) {
        return a+b;
    }
    public String add(String a,int b) {
        return a + b;
    }
}
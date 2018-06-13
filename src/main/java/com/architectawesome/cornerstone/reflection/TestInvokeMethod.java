package com.architectawesome.cornerstone.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by renwujie on 2018/06/13 at 11:53
 */
public class TestInvokeMethod {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> clazz = TestReflect5.class;
        //创建实例
        Object object = clazz.newInstance();
        //获取add方法
        Method method = clazz.getMethod("add", int.class, int.class);
        //调用
        Object result = method.invoke(object, 1, 4);
        System.out.println(result);
    }
}

class TestReflect5 {
    public final int fuck = 3;
    private int name;

    public TestReflect5() {
    }

    private TestReflect5(int name) {
        this.name = name;
    }

    public int add(int a, int b) {
        return a+b;
    }
    public String add(String a,int b) {
        return a + b;
    }
}
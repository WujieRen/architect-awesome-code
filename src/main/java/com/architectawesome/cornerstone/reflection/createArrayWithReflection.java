package com.architectawesome.cornerstone.reflection;

import java.lang.reflect.Array;

/**
 * Created by renwujie on 2018/06/13 at 12:12
 */
public class createArrayWithReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.String");
        Object array = Array.newInstance(clazz, 5);
        Array.set(array, 0, "renwujie");
        Array.set(array, 1, "wangxin");
        Array.set(array, 2, "sixin");
        Array.set(array, 3, "wangyan");
        Array.set(array, 4, "liuqiaoin");
        Array.set(array, 1, "fengyu");
        for (int i = 0; i < 5; ++i) {
            System.out.println(Array.get(array, i));
        }
    }
}

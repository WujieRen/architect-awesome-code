package com.architectawesome.cornerstone.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by renwujie on 2018/06/13 at 19:01
 *
 * 通过反射越过泛型检查。【泛型是在编译期进行检查，过了编译器就会擦除。】
 *
 * 如：一个泛型声明为String类型的集合，如何向其中添加一个int值？
 */
public class ByPassGenericInspection {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        List<String> strList = new ArrayList<>();
        strList.add("wangxin");
        strList.add("renwujie");
        strList.add("sixin");

        Class clazz = strList.getClass();
        Method method = clazz.getMethod("add", Object.class);
        //method.invoke(strList, 50);//加上这一句下面的函数式编程部分会报错，也是绕过类型检查机制的一个体现，这也说明了泛型可能会导致一些安全问题

        for(Object object : strList) {
            System.out.println(object);
        }

        strList = strList.parallelStream().filter(String.class::isInstance).sorted(String::compareTo).map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(strList.toString());
    }
}

package com.architectawesome.cornerstone.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by renwujie on 2018/06/13 at 11:01
 *
 * 关于::
 *  类型::方法名
 *  https://blog.csdn.net/lsmsrc/article/details/41747159
 *
 * 关于stream:
 *  https://www.ibm.com/developerworks/cn/java/j-lo-java8streamapi/index.html
 */
public class TestLambda3 {
    public static void main(String[] args){

    }

    public static void conVertTest() {
        List<String> list = new ArrayList<>();
        list.add("alpha");
        list.add("beta");
        list = list.stream().map(string -> string.toUpperCase()).collect(Collectors.toList());
    }

    public static void conVertTest2() {
        List<String> list = new ArrayList<>();
        list.add("alpha");
        list.add("beta");
        list = list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}

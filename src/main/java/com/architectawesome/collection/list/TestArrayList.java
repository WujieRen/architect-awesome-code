package com.architectawesome.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by renwujie on 2018/05/23 at 13:12
 */
public class TestArrayList {
    public static void main(String[] args){
        test1();
    }

    /**
     * 1.按顺序查找
     * 2.允许存储项为空
     * 3.允许多个存储项相等
     */
    static void test1() {
        List list = new ArrayList();
        list.add("zero");
        list.add(null);
        list.add("zero");
        list.add(null);
        list.add("three");
        System.out.println("index of null:" + list.indexOf(null));
        System.out.println("last index of null:" + list.lastIndexOf(null));
    }
}

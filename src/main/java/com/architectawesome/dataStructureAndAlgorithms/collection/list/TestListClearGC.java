package com.architectawesome.dataStructureAndAlgorithms.collection.list;

import java.util.ArrayList;

/**
 * Created by renwujie on 2018/05/24 at 21:04
 *
 * reference：http://li348720255.blog.163.com/blog/static/7671319320118210515459/
 */
public class TestListClearGC {
    public static void main(String[] args){
        test2();
    }

    static void test1() {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Now JVM total free memory:" + rt.freeMemory());

        ArrayList<String> list = new ArrayList<String>(1000000);
        System.out.println(rt.freeMemory());

        for(int i = 0; i < 100000; i++) {
            list.add(new String("rubbish"));
        }
        System.out.println("Free memory after create 1000000 rubbish:" + rt.freeMemory());

        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(rt.freeMemory());

        list.clear();

        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(rt.freeMemory());
    }

    static void test2() {
        ArrayList<String> list;
        list = new ArrayList<String>(10000);
        System.out.println(list.size());

        System.out.println(list.size());

        list.clear();
        System.out.println(list.size());

        list.add(null);
        System.out.println(list.size());

    }
}

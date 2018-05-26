package com.architectawesome.collection.map;

import java.util.*;

/**
 * Created by renwujie on 2018/05/26 at 14:02
 *
 * reference: https://baike.xsoftlab.net/view/250.html#paragraph_4
 *
 * 所有的System.gc()原实例代码中没有的，我这里做了改进，做到了尽可能控制其他条件一致的情况下，去单独地比较某一个因素。
 */
public class TestMapReadRatio {
    static int hashMapW = 0;
    static int hashMapR = 0;
    static int linkMapW = 0;
    static int linkMapR = 0;
    static int treeMapW = 0;
    static int treeMapR = 0;
    static int hashTableW = 0;
    static int hashTableR = 0;

    public static void main(String[] args){
        System.gc();
        test(100000);
    }

    static void test(int size) {
        int index;
        Random random = new Random();
        String[] key = new String[size];
        //HashMap插入
        Map<String, String> map = new HashMap<String, String>();
        long start = System.currentTimeMillis();
        for(int i = 0; i < size; ++i) {
            key[i] = UUID.randomUUID().toString();
            map.put(key[i], UUID.randomUUID().toString());
        }
        long end = System.currentTimeMillis();
        hashMapW += (end - start);
        System.out.println("HashMap插入耗时 = " + (end - start) + " ms");
        //HashMap读取
        start = System.currentTimeMillis();
        for(int i = 0; i < size; ++i) {
            index = random.nextInt(size);
            map.get(key[index]);
        }
        end = System.currentTimeMillis();
        hashMapR += (end - start);
        System.out.println("HashMap读取耗时 = " + (end - start) + " ms");

        System.gc();

        //LinkedHashMap插入
        key = new String[size];
        map = new LinkedHashMap<String, String>();
        start = System.currentTimeMillis();
        for(int i = 0; i < size; ++i) {
            key[i] = UUID.randomUUID().toString();
            map.put(key[i], UUID.randomUUID().toString());
        }
        end = System.currentTimeMillis();
        linkMapW += (start - end);
        System.out.println("LinkedHashMap插入耗时 = " + (end - start) + " ms");
        //LinkedHashMap读取
        start = System.currentTimeMillis();
        for(int i = 0; i < size; ++i) {
            index = random.nextInt(size);
            map.get(key[index]);
        }
        end = System.currentTimeMillis();
        linkMapR += (end - start);
        System.out.println("LinkedHashMap读取耗时 = " + (end - start) + " ms");

        System.gc();

        //TreeMap写入
        key = new String[size];
        map = new TreeMap<String, String>();
        start = System.currentTimeMillis();
        for(int i = 0; i < size; ++i) {
            key[i] = UUID.randomUUID().toString();
            map.put(key[i], UUID.randomUUID().toString());
        }
        end = System.currentTimeMillis();
        treeMapW += (end - start);
        System.out.println("TreeMap插入耗时 = " + (end - start) + " ms");
        // TreeMap 读取
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            index = random.nextInt(size);
            map.get(key[index]);
        }
        end = System.currentTimeMillis();
        treeMapR += (end - start);
        System.out.println("TreeMap读取耗时 = " + (end - start) + " ms");

        System.gc();

        // Hashtable 插入
        key = new String[size];
        map = new Hashtable<String, String>();
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            key[i] = UUID.randomUUID().toString();
            map.put(key[i], UUID.randomUUID().toString());
        }
        end = System.currentTimeMillis();
        hashTableW += (end - start);
        System.out.println("Hashtable插入耗时 = " + (end - start) + " ms");
        // Hashtable 读取
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            index = random.nextInt(size);
            map.get(key[index]);
        }
        end = System.currentTimeMillis();
        hashTableR += (end - start);
        System.out.println("Hashtable读取耗时 = " + (end - start) + " ms");

        System.gc();
    }
}

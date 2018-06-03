package com.architectawesome.dataStructureAndAlgorithms.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by renwujie on 2018/05/27 at 0:57
 *
 * reference: https://baike.xsoftlab.net/view/250.html#paragraph_4
 *
 * 分别对四种遍历方式进行10W次迭代，比较用时。
 */
public class TestMapLoopRatio {
    public static void main(String[] args){
        //初始化，10W次赋值
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < 100000; ++i) {
            map.put(i, i);
        }

        /*增强for循环，keySet迭代*/
        long start = System.currentTimeMillis();
        Set<Integer> keySet =  map.keySet();
        for(Integer key : keySet) {
            map.get(key);
        }
        long end = System.currentTimeMillis();
        System.out.println("增强for循环，keySet迭代 -> " + (end - start) + " ms");

        /*增强for循环，entrySet迭代*/
        start = System.currentTimeMillis();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
        end = System.currentTimeMillis();
        System.out.println("增强for循环，entrySet迭代 -> " + (end - start) + " ms");

        /*迭代器，keySet迭代*/
        start = System.currentTimeMillis();
        Iterator<Integer> iteratorKey = map.keySet().iterator();
        Integer key;
        while(iteratorKey.hasNext()) {
            key = iteratorKey.next();
            map.get(key);
        }
        end = System.currentTimeMillis();
        System.out.println("迭代器，keySet迭代 -> " + (end - start) + " ms");

        //这个是对原先作者代码的一点改进，因为希望避免引用类型导致jvm空间的减小而导致的影响
        System.gc();

        /*迭代器，entrySet迭代*/
        start = System.currentTimeMillis();
        Iterator<Map.Entry<Integer, Integer>> iteratorEntry = map.entrySet().iterator();
        Map.Entry<Integer, Integer> entry;
        while (iteratorEntry.hasNext()) {
            entry = iteratorEntry.next();
            entry.getKey();
            entry.getValue();
        }
        end = System.currentTimeMillis();
        System.out.println("迭代器，entrySet迭代 -> " + (end - start) + " ms");

        System.gc();
    }
}

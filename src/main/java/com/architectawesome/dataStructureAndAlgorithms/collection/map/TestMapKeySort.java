package com.architectawesome.dataStructureAndAlgorithms.collection.map;

import java.util.*;

/**
 * Created by renwujie on 2018/05/27 at 1:22
 *
 * reference: https://baike.xsoftlab.net/view/250.html#paragraph_4
 */
public class TestMapKeySort {
    public static void main(String[] args){
        //Map<String, String> map = new HashMap<String, String>();
        //map.put("b", "b");
        //map.put("a", "a");
        //map.put("c", "c");
        //recommandCustomComparator(map);

        overrideTreeMapDefaultKeySortWay();
    }

    /**
     * HashMap
     * HashTable
     * LinkedHashMap
     */
    static void recommandCustomComparator(Map map) {

        //通过ArrayList构造函数将map.entrySet()转换成List
        List<Map.Entry<String, String>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> map1, Map.Entry<String, String> map2) {
                return map1.getKey().compareTo(map2.getKey());
            }
        });

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        Map.Entry entry;
        while (iterator.hasNext()) {
            entry = iterator.next();
            System.out.println(entry.getKey() + " ：" + entry.getValue());
        }
    }

    /**
     *TreeMap
     * TreeMap默认按key进行升序排序，如果想改变默认的顺序，可以使用比较器
     */
    static void overrideTreeMapDefaultKeySortWay() {
        Map<String, String> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //降序排序
                return o2.compareTo(o1);
            }
        });

        map.put("b", "b");
        map.put("a", "a");
        map.put("c", "c");

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " ：" + entry.getValue());
        }
    }





}

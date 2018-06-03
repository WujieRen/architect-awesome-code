package com.architectawesome.dataStructureAndAlgorithms.collection.map;

import java.util.*;

/**
 * Created by renwujie on 2018/05/27 at 1:40
 *
 * reference: https://baike.xsoftlab.net/view/250.html#paragraph_4
 */
public class TestMapValueSort {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<String, String>();
        map.put("b", "b");
        map.put("c", "c");
        map.put("a", "a");

        //通过ArrayList构造函数把map.entrySet()转换成list
        List<Map.Entry<String, String>> list = new ArrayList<>(map.entrySet());
       /* list.sort(new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> mapping1, Map.Entry<String, String> mapping2) {
                return mapping1.getValue().compareTo(mapping2.getValue());
            }
        });*/
       Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
           @Override
           public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
               return o1.getValue().compareTo(o2.getValue());
           }
       });

        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}

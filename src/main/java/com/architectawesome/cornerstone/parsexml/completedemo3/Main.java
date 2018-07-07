package com.architectawesome.cornerstone.parsexml.completedemo3;

import com.architectawesome.cornerstone.parsexml.lemontest.model.Algrithm;

/**
 * Created by renwujie on 2018/07/03 at 14:28
 */
public class Main {
    public static void main(String[] args){
        String xml = "<c c1=\"0\">\n" +
                "    <d d1=\"101280101\" d2=\"广州\" d3=\"guangzhou\" d4=\"广东\"/>\n" +
                "    <d d1=\"101280102\" d2=\"番禺\" d3=\"panyu\" d4=\"广东\"/>\n" +
                "    <d d1=\"101280103\" d2=\"从化\" d3=\"conghua\" d4=\"广东\"/>\n" +
                "</c>";
        //Algrithm algrithm = (Algrithm) XStreamUtil.toBean(Algrithm.class, "E:\\WorkSpaceIDEA\\architectAwesome\\src\\main\\java\\com\\architectawesome\\cornerstone\\parsexml\\completedemo3\\test.xml");
        Algrithm algrithm = (Algrithm) XStreamUtil.toBean(Algrithm.class, xml);
        System.out.println(algrithm);
    }
}

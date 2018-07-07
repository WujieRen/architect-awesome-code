package com.architectawesome.cornerstone.parsexml.lemontest.demo2Test;

import com.architectawesome.cornerstone.parsexml.lemontest.model.Algrithm;

/**
 * Created by renwujie on 2018/07/03 at 10:41
 */
public class Test {
    public static void main(String[] args) {
        String path = "E:\\WorkSpaceIDEA\\architectAwesome\\src\\main\\java\\com\\architectawesome\\cornerstone\\parsexml\\lemontest\\inportAlg.xml";
        System.out.println("---将File类型的xml转换成对象 Start---");
        Algrithm algrithm = (Algrithm) XMLUtil.convertXmlFileToObject(Algrithm.class, path);
        System.out.println(algrithm);
        System.out.println("---------");
        System.out.println(algrithm.getOutputProperties().get(0).getOutputPropertyRoleList());
        System.out.println("---------");
        System.out.println(algrithm.getOutputProperties().get(0).getOutputPropertyRole());
        System.out.println("---将File类型的xml转换成对象 End---");



    }

}

package com.architectawesome.cornerstone.parsexml.completedemo2_abetterway.singleObject;

import com.architectawesome.cornerstone.parsexml.completedemo2_abetterway.XMLUtil;
import com.architectawesome.cornerstone.parsexml.completedemo2_abetterway.singleObject.model.User;

import java.util.Date;

/**
 * Created by renwujie on 2018/07/03 at 10:26
 */
public class Test {
    public static void main(String[] args){
        User user = new User(1, "Steven", "@sun123", new Date(), 1000.0);
        System.out.println("---将对象转换成string类型的xml Start---");
        // 将对象转换成string类型的xml
        String str = XMLUtil.convertToXml(user);
        // 输出
        System.out.println(str);
        System.out.println("---将对象转换成string类型的xml End---");
        System.out.println();
        System.out.println("---将String类型的xml转换成对象 Start---");
        User userTest = (User) XMLUtil.convertXmlStrToObject(User.class, str);
        System.out.println(userTest);
        System.out.println("---将String类型的xml转换成对象 End---");
    }
}

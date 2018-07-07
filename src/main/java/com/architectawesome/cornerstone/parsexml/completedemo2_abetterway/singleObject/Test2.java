package com.architectawesome.cornerstone.parsexml.completedemo2_abetterway.singleObject;

import com.architectawesome.cornerstone.parsexml.completedemo2_abetterway.XMLUtil;
import com.architectawesome.cornerstone.parsexml.completedemo2_abetterway.singleObject.model.User;

import java.util.Date;

/**
 * Created by renwujie on 2018/07/03 at 10:32
 */
public class Test2 {
    public static void main(String[] args){
        // 创建需要转换的对象
        User user = new User(1, "Steven", "@sun123", new Date(), 1000.0);

        String path = "E:\\WorkSpaceIDEA\\architectAwesome\\src\\main\\java\\com\\architectawesome\\cornerstone\\parsexml\\completedemo2\\xml2java\\user.xml";
        //System.out.println("---将对象转换成File类型的xml Start---");
        //XMLUtil.convertToXml(user, path);
        //System.out.println("---将对象转换成File类型的xml End---");
        //System.out.println();
        System.out.println("---将File类型的xml转换成对象 Start---");
        User user2 = (User) XMLUtil.convertXmlFileToObject(User.class, path);
        System.out.println(user2);
        System.out.println("---将File类型的xml转换成对象 End---");

    }
}

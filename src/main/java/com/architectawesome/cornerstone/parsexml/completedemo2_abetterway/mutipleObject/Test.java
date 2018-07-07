package com.architectawesome.cornerstone.parsexml.completedemo2_abetterway.mutipleObject;

import com.architectawesome.cornerstone.parsexml.completedemo2_abetterway.XMLUtil;
import com.architectawesome.cornerstone.parsexml.completedemo2_abetterway.mutipleObject.model.User;

/**
 * Created by renwujie on 2018/07/03 at 10:41
 */
public class Test {
    public static void main(String[] args) {
        //User user = new User(1, "Steven", "@sun123", new Date(), 1000.0);
        //List<Computer> list = new ArrayList<Computer>();
        //list.add(new Computer("xxxMMeedd", "asus", new Date(), 4455.5));
        //list.add(new Computer("lenvoXx", "lenvo", new Date(), 4999));
        //user.setComputers(list);
        String path = "E:\\WorkSpaceIDEA\\architectAwesome\\src\\main\\java\\com\\architectawesome\\cornerstone\\parsexml\\completedemo2_abetterway\\mutipleObject\\user2.xml";
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

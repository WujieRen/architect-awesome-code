package com.architectawesome.cornerstone.parsexml.acompletedemo;

import com.alibaba.fastjson.JSON;
import com.architectawesome.cornerstone.parsexml.acompletedemo.model.Book;
import com.architectawesome.cornerstone.parsexml.acompletedemo.parser.SaxHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * Created by renwujie on 2018/07/02 at 11:51
 */
public class Main {
    public static void main(String[] args){
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File("E:\\WorkSpaceIDEA\\architectAwesome\\src\\main\\java\\com\\architectawesome\\cornerstone\\parsexml\\acompletedemo\\book.xml"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Book> bookList = SaxHelper.saxReader(inputStream);
        String jsonObject = JSON.toJSONString(bookList);
        System.out.println("_____________JSONString______________");
        System.out.println(jsonObject);
        //if(bookList != null) {
        //    for(Book book : bookList) {
        //        System.out.println(book);
        //    }
        //}
    }
}

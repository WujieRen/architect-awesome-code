package com.architectawesome.cornerstone.parsexml.acompletedemo.parser;

import com.architectawesome.cornerstone.parsexml.acompletedemo.model.Book;
import com.architectawesome.cornerstone.parsexml.acompletedemo.util.DateUtil;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by renwujie on 2018/07/02 at 11:03
 * <p>
 * parse xml file with sax
 */
public class XmlContentHandler extends DefaultHandler {
    private Book book;    //保存每一个节点的对象

    private List<Book> books;    //保存已解析好的节点对象

    private String preTag;        //保存当前正在解析的节点标签名

    @Override
    public void startDocument() throws SAXException {
        System.out.println("开始解析文档...");
        books = new ArrayList<Book>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        System.out.println("URI: " + uri);
        System.out.println("lcoalName: " + localName);
        System.out.println("qName: " + qName);
        System.out.println("attributes: " + attributes);

        if (qName.equals("book") && book == null) {
            book = new Book();
            book.setIsbn(attributes.getValue("", "isbn"));
        }
        preTag = qName;    //记录当前开始节点名
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (book != null && preTag != null && !"book".equals(preTag) && !"book".equals(preTag)) {
            String data = new String(ch, start, length);
            if (!"".equals(data.trim())) {
                switch (preTag) {
                    case "name": book.setName(data); break;
                    case "author": book.setAuthor(data); break;
                    case "publishing": book.setPublishing(data); break;
                    case "pubdate":
                        book.setPubdate(DateUtil.string2Date("yyyy-MM-dd", data));
                        break;
                    case "price": book.setPrice(Double.parseDouble(data)); break;
                    default: break;
                }
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ("book".equals(qName) && book != null) {
            books.add(book);
            book = null;
        }
        preTag = null;
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("XML文件解析结束...");
        System.out.println("结果:" + books);
    }

    /**
     * 获得解析后的数据
     *
     * @return
     */
    public List<Book> getBooks() {
        return books;
    }

}

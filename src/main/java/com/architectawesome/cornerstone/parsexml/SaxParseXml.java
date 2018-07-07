package com.architectawesome.cornerstone.parsexml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by renwujie on 2018/07/02 at 9:55
 */
public class SaxParseXml {


    public static void main(String[] args) throws SAXException {
        XMLReader parser = XMLReaderFactory.createXMLReader();
        //BookHandler bookHandler = new SAXParser()

    }
}

class BookHandler extends DefaultHandler{
    private List<String> nameList;
    private boolean title = false;

    public List<String> getNameList() {
        return nameList;
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start parsing document...");
        nameList = new ArrayList<>();
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("End");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if(qName.equals("title")) {
            title = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(title) {
            title = false;
        }
    }

    public void characters(char[] ch, int start, int length) {
        // Processing character data inside an element
        if (title) {
            String bookTitle = new String(ch, start, length);
            System.out.println("Book title: " + bookTitle);
            nameList.add(bookTitle);
        }
    }
}
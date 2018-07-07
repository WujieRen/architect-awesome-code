package com.architectawesome.cornerstone.parsexml.acompletedemo.parser;

import com.architectawesome.cornerstone.parsexml.acompletedemo.model.Book;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by renwujie on 2018/07/02 at 11:03
 */
public class SaxHelper {
    private static SAXParserFactory spf;

    public static List<Book> saxReader(InputStream is) {
        if(spf == null) {
            spf = SAXParserFactory.newInstance();
        }

        try {
            SAXParser saxParser = spf.newSAXParser();
            XmlContentHandler xmlContentHandler = new XmlContentHandler();
            saxParser.parse(is, xmlContentHandler);
            return xmlContentHandler.getBooks();
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            if(is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

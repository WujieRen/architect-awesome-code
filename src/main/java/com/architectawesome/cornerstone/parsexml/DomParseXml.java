package com.architectawesome.cornerstone.parsexml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by renwujie on 2018/06/29 at 18:14
 */
public class DomParseXml {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        //domParse();
        domParse2();
    }

    /**
     * 第一种dom方式
     * @throws IOException
     * @throws SAXException
     * @throws ParserConfigurationException
     */
    public static void domParse() throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
        Document doc = null;
        doc = docBuilder.parse("E:\\WorkSpaceIDEA\\architectAwesome\\src\\main\\resources\\parsexml\\testparse.xml");

        NodeList list = doc.getElementsByTagName("disk");
        for(int i = 0; i < list.getLength(); i++) {
            Element element = (Element) list.item(i);
            String name = element.getAttribute("name");
            String capacity = element.getElementsByTagName("capacity").item(0).getFirstChild().getNodeValue();
            String directories=element.getElementsByTagName("directories").item(0).getFirstChild().getNodeValue();
            String files=element.getElementsByTagName("files").item(0).getFirstChild().getNodeValue();

            System.out.println("磁盘信息:");
            System.out.println("分区盘符:"+name);
            System.out.println("分区容量:"+capacity);
            System.out.println("目录数:"+directories);
            System.out.println("文件数:"+files);
            System.out.println("-----------------------------------");
        }
    }

    public static void domParse2() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        Document document = builder.parse("E:\\WorkSpaceIDEA\\architectAwesome\\src\\main\\resources\\parsexml\\testparse.xml");
        Element rootElement = document.getDocumentElement();
        NodeList nodes = rootElement.getChildNodes();
        for(int i = 0; i < nodes.getLength(); ++i) {
            Node node = nodes.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE) {
                Element child = (Element) node;
                //process child element
                String capacity = child.getElementsByTagName("capacity").item(0).getFirstChild().getNodeValue();
                System.out.println(capacity);
            }
        }

        NodeList nodeList = rootElement.getElementsByTagName("disk");
        if(nodeList != null) {
            for(int i = 0; i < nodeList.getLength(); ++i) {
                Element element = (Element) nodeList.item(i);
                String id = element.getAttribute("name");
                System.out.println(id);
            }
        }

    }

}

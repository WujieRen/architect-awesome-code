package com.architectawesome.cornerstone.parsexml.DynamicNodeDemo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by renwujie on 2018/07/10 at 16:50
 */
public class TestDynamicNode {
    public static void main(String[] args) throws JAXBException {
        Object xmlObject = null;
        try {
            JAXBContext context = JAXBContext.newInstance(Response.class, D1.class, D2.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            FileReader fr = null;
            try {
                fr = new FileReader("E:\\WorkSpaceIDEA\\architectAwesome\\src\\main\\java\\com\\architectawesome\\cornerstone\\parsexml\\DynamicNodeDemo\\test.xml");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            xmlObject = unmarshaller.unmarshal(fr);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        System.out.println(xmlObject);

    }

}

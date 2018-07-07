package com.architectawesome.cornerstone.parsexml.completedemo3;

import com.thoughtworks.xstream.XStream;

/**
 * Created by renwujie on 2018/07/03 at 14:21
 */
public class XStreamUtil {
    public static Object toBean(Class<?> clazz, String xml) {
        Object xmlObject = null;
        XStream xstream = new XStream();
        xstream.processAnnotations(clazz);
        xstream.autodetectAnnotations(true);
        xmlObject = xstream.fromXML(xml);
        //xmlObject = xstream.fromXML(new File(xml));
        return xmlObject;
    }
}

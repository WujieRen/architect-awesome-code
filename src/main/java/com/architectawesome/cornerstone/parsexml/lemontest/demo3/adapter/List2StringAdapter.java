package com.architectawesome.cornerstone.parsexml.lemontest.demo3.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Created by renwujie on 2018/07/04 at 15:49
 */
public class List2StringAdapter extends XmlAdapter<String, String>{

    @Override
    public String unmarshal(String v) throws Exception {
        if(!v.endsWith(",")) {
            v += ",";
        }
        return v;
    }

    @Override
    public String marshal(String v) throws Exception {
        String[] valus = v.split(",");
        for(String value : valus) {
            v = value;
        }
        return v;
    }
}

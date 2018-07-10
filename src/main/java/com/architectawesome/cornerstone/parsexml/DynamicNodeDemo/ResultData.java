package com.architectawesome.cornerstone.parsexml.DynamicNodeDemo;

import javax.xml.bind.annotation.XmlAnyElement;
import java.util.List;

/**
 * Created by renwujie on 2018/07/10 at 17:24
 */
public class ResultData {
    private List<Object> datas;

    @XmlAnyElement(lax = true)
    public List<Object> getDatas() {
        return datas;
    }

    public void setDatas(List<Object> datas) {
        this.datas = datas;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "datas=" + datas +
                '}';
    }
}
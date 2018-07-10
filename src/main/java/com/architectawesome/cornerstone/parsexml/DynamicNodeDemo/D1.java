package com.architectawesome.cornerstone.parsexml.DynamicNodeDemo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by renwujie on 2018/07/10 at 17:21
 */
@XmlRootElement
public class D1 {
    private String d11;
    private String d12;
    public String getD11() {
        return d11;
    }
    public void setD11(String d11) {
        this.d11 = d11;
    }
    public String getD12() {
        return d12;
    }
    public void setD12(String d12) {
        this.d12 = d12;
    }

    @Override
    public String toString() {
        return "D1{" +
                "d11='" + d11 + '\'' +
                ", d12='" + d12 + '\'' +
                '}';
    }
}

package com.architectawesome.cornerstone.parsexml.DynamicNodeDemo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by renwujie on 2018/07/10 at 17:21
 */
@XmlRootElement
public class D2 {
    private String d21;
    private String d22;

    public String getD21() {
        return d21;
    }
    public void setD21(String d21) {
        this.d21 = d21;
    }
    public String getD22() {
        return d22;
    }
    public void setD22(String d22) {
        this.d22 = d22;
    }

    @Override
    public String toString() {
        return "D2{" +
                "d21='" + d21 + '\'' +
                ", d22='" + d22 + '\'' +
                '}';
    }
}
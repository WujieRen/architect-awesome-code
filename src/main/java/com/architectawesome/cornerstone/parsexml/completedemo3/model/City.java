package com.architectawesome.cornerstone.parsexml.completedemo3.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Created by renwujie on 2018/07/03 at 14:20
 */
@XStreamAlias("d")
public class City {
    @XStreamAsAttribute
    @XStreamAlias("d1")
    private String cityId;

    @XStreamAsAttribute
    @XStreamAlias("d2")
    private String cityName;

    @XStreamAlias("d3")
    @XStreamAsAttribute
    private String cityCode;

    @XStreamAsAttribute
    @XStreamAlias("d4")
    private String province;
}
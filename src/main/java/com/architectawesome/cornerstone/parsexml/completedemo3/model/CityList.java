package com.architectawesome.cornerstone.parsexml.completedemo3.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * Created by renwujie on 2018/07/03 at 14:20
 */
@XStreamAlias("c")
public class CityList {
    @XStreamImplicit(itemFieldName="d")
    private List<City> cityList;
}

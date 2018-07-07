package com.architectawesome.cornerstone.parsexml.lemontest.model;

import java.util.List;

/**
 * Created by renwujie on 2018/07/03 at 15:22
 */
public class OutputProperty {
    private List<AlgrithmOutputProperty> property;

    public OutputProperty() {
    }

    public OutputProperty(List<AlgrithmOutputProperty> property) {
        this.property = property;
    }

    public List<AlgrithmOutputProperty> getProperty() {
        return property;
    }

    public void setProperty(List<AlgrithmOutputProperty> property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "OutputProperty{" +
                "propertys=" + property +
                '}';
    }
}

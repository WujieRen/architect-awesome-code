package com.architectawesome.cornerstone.parsexml.lemontest.model;

import java.util.List;

/**
 * Created by renwujie on 2018/07/03 at 14:55
 */
public class InputProperty {
    private List<AlgrithmInputProperty> property;

    public InputProperty() {
    }

    public InputProperty(List<AlgrithmInputProperty> property) {
        this.property = property;
    }

    public List<AlgrithmInputProperty> getProperty() {
        return property;
    }

    public void setProperty(List<AlgrithmInputProperty> property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "InputProperty{" +
                "properties=" + property +
                '}';
    }
}

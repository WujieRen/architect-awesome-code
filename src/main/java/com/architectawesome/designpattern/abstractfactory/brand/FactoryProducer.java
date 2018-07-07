package com.architectawesome.designpattern.abstractfactory.brand;

import com.architectawesome.designpattern.abstractfactory.brand.factory.AbstractBrandFactory;
import com.architectawesome.designpattern.abstractfactory.brand.factory.AirConditionerBrandFactory;
import com.architectawesome.designpattern.abstractfactory.brand.factory.RefrigeratorBrandFactory;

/**
 * Created by renwujie on 2018/06/20 at 17:31
 */
public class FactoryProducer {
    public static AbstractBrandFactory getFactory(String factoryType) {
        if(factoryType.equalsIgnoreCase("SHAPE")){
            return new RefrigeratorBrandFactory();
        } else if(factoryType.equalsIgnoreCase("COLOR")){
            return new AirConditionerBrandFactory();
        } else {
            return null;
        }
    }
}

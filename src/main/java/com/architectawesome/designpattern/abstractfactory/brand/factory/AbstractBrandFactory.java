package com.architectawesome.designpattern.abstractfactory.brand.factory;

import com.architectawesome.designpattern.abstractfactory.brand.color.Airconditioner;
import com.architectawesome.designpattern.abstractfactory.brand.shape.Refrigerator;

/**
 * Created by renwujie on 2018/06/20 at 17:24
 */
public abstract class AbstractBrandFactory {
    public abstract Airconditioner getAirConditioner(String airType);
    public abstract Refrigerator getRefrigerator(String refrigeratorType);
}

package com.architectawesome.designpattern.abstractfactory.brand;

import com.architectawesome.designpattern.abstractfactory.brand.color.Airconditioner;
import com.architectawesome.designpattern.abstractfactory.brand.factory.AbstractBrandFactory;
import com.architectawesome.designpattern.abstractfactory.brand.shape.Refrigerator;

/**
 * Created by renwujie on 2018/06/20 at 17:33
 */
public class Main {
    public static void main(String[] args){
        AbstractBrandFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Refrigerator circle =  shapeFactory.getRefrigerator("circle");
        circle.draw();

        AbstractBrandFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Airconditioner red = colorFactory.getAirConditioner("RED");
        red.fill();
    }
}

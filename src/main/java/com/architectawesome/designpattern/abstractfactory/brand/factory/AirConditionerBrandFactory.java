package com.architectawesome.designpattern.abstractfactory.brand.factory;

import com.architectawesome.designpattern.abstractfactory.brand.color.Airconditioner;
import com.architectawesome.designpattern.abstractfactory.brand.color.GeliAir;
import com.architectawesome.designpattern.abstractfactory.brand.color.HaierAir;
import com.architectawesome.designpattern.abstractfactory.brand.color.XiaomiAir;
import com.architectawesome.designpattern.abstractfactory.brand.shape.Refrigerator;

/**
 * Created by renwujie on 2018/06/20 at 17:30
 */
public class AirConditionerBrandFactory extends AbstractBrandFactory {
    @Override
    public Airconditioner getAirConditioner(String airType) {
        if(airType.equalsIgnoreCase("GELI")) {
            return new GeliAir();
        } else if(airType.equalsIgnoreCase("HAIER")) {
            return new HaierAir();
        } else if(airType.equalsIgnoreCase("XIAOMI")) {
            return new XiaomiAir();
        } else {
            return null;
        }
    }

    @Override
    public Refrigerator getRefrigerator(String refrigeratorType) {
        return null;
    }
}

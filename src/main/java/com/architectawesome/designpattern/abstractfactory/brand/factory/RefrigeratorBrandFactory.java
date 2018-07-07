package com.architectawesome.designpattern.abstractfactory.brand.factory;

import com.architectawesome.designpattern.abstractfactory.brand.color.Airconditioner;
import com.architectawesome.designpattern.abstractfactory.brand.shape.GeliRefrigerator;
import com.architectawesome.designpattern.abstractfactory.brand.shape.HaierRefrigerator;
import com.architectawesome.designpattern.abstractfactory.brand.shape.Refrigerator;
import com.architectawesome.designpattern.abstractfactory.brand.shape.XiaomiRefrigerator;

/**
 * Created by renwujie on 2018/06/20 at 17:26
 */
public class RefrigeratorBrandFactory extends AbstractBrandFactory {
    @Override
    public Airconditioner getAirConditioner(String airType) {
        return null;
    }

    @Override
    public Refrigerator getRefrigerator(String refrigeratorType) {
        if(refrigeratorType.equalsIgnoreCase("GELI")) {
            return new GeliRefrigerator();
        } else if(refrigeratorType.equalsIgnoreCase("HAIER")) {
            return new HaierRefrigerator();
        } else if(refrigeratorType.equalsIgnoreCase("XIAOMI")) {
            return new XiaomiRefrigerator();
        } else {
            return null;
        }
    }
}

package com.architectawesome.designpattern.abstractfactory.brand.color;

/**
 * Created by renwujie on 2018/06/20 at 16:49
 */
public class XiaomiAir implements Airconditioner {
    @Override
    public void fill() {
        System.out.println("Inside XiaomiAir::fill() method.");
    }
}

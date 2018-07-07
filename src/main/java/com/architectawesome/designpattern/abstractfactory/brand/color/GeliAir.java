package com.architectawesome.designpattern.abstractfactory.brand.color;

/**
 * Created by renwujie on 2018/06/20 at 16:50
 */
public class GeliAir implements Airconditioner {
    @Override
    public void fill() {
        System.out.println("Inside GeliAir::fill() method.");
    }
}

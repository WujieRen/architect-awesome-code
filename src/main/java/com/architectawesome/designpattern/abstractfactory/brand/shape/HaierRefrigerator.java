package com.architectawesome.designpattern.abstractfactory.brand.shape;

/**
 * Created by renwujie on 2018/06/20 at 16:47
 */
public class HaierRefrigerator implements Refrigerator {
    @Override
    public void draw() {
        System.out.println("Inside HaierRefrigerator::draw() method.");
    }
}

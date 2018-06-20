package com.architectawesome.designpattern.factorypattern;

/**
 * Created by renwujie on 2018/06/19 at 18:52
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

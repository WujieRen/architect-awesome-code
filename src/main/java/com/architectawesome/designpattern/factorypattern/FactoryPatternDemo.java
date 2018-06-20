package com.architectawesome.designpattern.factorypattern;

/**
 * Created by renwujie on 2018/06/20 at 9:45
 */
public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Circle circle = (Circle) shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

    }
}

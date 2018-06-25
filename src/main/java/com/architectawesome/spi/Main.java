package com.architectawesome.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by renwujie on 2018/06/25 at 15:47
 */
public class Main {
    public static void main(String[] args){
        ServiceLoader<AbstractInterface> serviceLoader = ServiceLoader.load(AbstractInterface.class);
        Iterator<AbstractInterface> iterator = serviceLoader.iterator();
        while(iterator != null && iterator.hasNext()) {
            AbstractInterface abstractInterface = iterator.next();
            System.out.println("class：" + abstractInterface.getClass().getName());
            abstractInterface.sayHi();
        }
    }
}

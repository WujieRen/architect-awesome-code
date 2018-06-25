package com.architectawesome.spi.impl;

import com.architectawesome.spi.AbstractInterface;

/**
 * Created by renwujie on 2018/06/25 at 15:38
 */
public class EntityInterface1 implements AbstractInterface {
    @Override
    public void sayHi() {
        System.out.println("EntityInterface1.sayHi");
    }
}

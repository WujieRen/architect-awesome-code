package com.architectawesome.cornerstone.reflection.dynamicproxy;

/**
 * Created by renwujie on 2018/06/13 at 9:57
 */
public class TestReflect2 implements Interface{

    @Override
    public void doSomething() {
        System.out.println("keep doing something");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("something else like " + arg);
    }
}

class TestReflect3 implements Interface {

    @Override
    public void doSomething() {
        System.out.println("another proxy...");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("another proxy else...");
    }
}

interface Interface{
    void doSomething();
    void somethingElse(String arg);
}
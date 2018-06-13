package com.architectawesome.cornerstone.reflection.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Created by renwujie on 2018/06/13 at 10:03
 */
public class Main {
    /**
     * 调用Proxy的静态方法newProxyInstance()可以创建动态代理，这个方法需要得到一个类加载器，一个你希望该代理实现的接口列表（不是类或抽象类），以及一个InvocationHandler的一个实现类。
     *
     * 动态代理可以将所有调用重定向到调用处理器，因此通常会调用处理器的构造器传递一个“实际对象”的引用，从而将调用处理器在执行中介任务时，将请求转发。
     * @param args
     */
    public static void main(String[] args){
        TestReflect2 reflect2 = new TestReflect2();
        TestReflect3 reflect3 = new TestReflect3();

        Interface proxy2 = getProxy(reflect2);
        proxy2.doSomething();
        proxy2.somethingElse("renwujie");

        Interface proxy3 = getProxy(reflect3);
        proxy3.doSomething();
        proxy3.somethingElse("wangxin");
    }

    public static Interface getProxy(Object proxyObject) {
        return (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(proxyObject)
        );
    }
}

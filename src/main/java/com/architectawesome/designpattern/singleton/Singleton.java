package com.architectawesome.designpattern.singleton;

/**
 * Created by renwujie on 2018/06/16 at 22:39
 */
public class Singleton {
    public static void main(String[] args){
        System.out.println(Way1.getInstance() == Way1.getInstance());
        System.out.println(Way2.getInstance() == Way2.getInstance());
        System.out.println(Way3.getInstance() == Way3.getInstance());
    }
}

class Way1{
    /**
     * 利用静态变量实现
     */
    private static Way1 singleton = new Way1();

    private Way1() { }

    static Way1 getInstance() {
        return singleton;
    }
}

class Way2 {
    private volatile static Way2 singleton;

    private Way2(){}

    /**
     * 同步方法，效率低于双重检查机制
     * @return
     */
    public static synchronized Way2 getInstance() {
        if(singleton == null) {
            singleton = new Way2();
        }
        return singleton;
    }
}

class Way3{
    private volatile static Way3 singleton;

    private Way3() {

    }

    /**
     * 双重检查机制
     * @return
     */
    //TODO:这里是首先检查是否实例已经创建了，如果尚未创建，才会进行同步。这样一来。只有第一次会同步。
    //这句实在是没懂...
    public static Way3 getInstance() {
        if(singleton == null) {
            synchronized (Way3.class) {
                if(singleton == null) {
                    singleton = new Way3();
                }
            }
        }
        return singleton;
    }
}
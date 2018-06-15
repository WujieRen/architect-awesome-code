package com.architectawesome.cornerstone.reflection;

/**
 * Created by renwujie on 2018/06/13 at 17:05
 */
public class GetClass {
    public static void main(String[] args){
        Class clazz = new Person().getClass();
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getName());

        Class klass = Person.class;
        System.out.println(klass.getName());

        try {
            Class klazz = Class.forName("com.architectawesome.cornerstone.reflection.Person");
            //jvm运行期间，每个类只有一个Class对象
            System.out.println(clazz == klass);
            System.out.println(clazz == klazz);
            System.out.println(klass == klazz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

class Things{
    private String color;
    public String shape;

    public Things() {
    }

    public Things(String color, String shape) {
        this.color = color;
        this.shape = shape;
    }

    public String exists() {
        return "yes";
    }
}

class Person extends Things {

    public String name;
    protected int age;
    char sex;
    private String phoneNum;

    //---------------构造方法-------------------
    //（默认的构造方法）
    Person(String str){
        System.out.println("(默认)的构造方法 s = " + str);
    }

    //无参构造方法
    public Person(){
        System.out.println("调用了公有、无参构造方法执行了。。。");
    }

    //有一个参数的构造方法
    public Person(char name){
        System.out.println("姓名：" + name);
    }

    //有多个参数的构造方法
    public Person(String name ,int age){
        System.out.println("姓名："+name+"年龄："+ age);//这的执行效率有问题，以后解决。
    }

    //受保护的构造方法
    protected Person(boolean n){
        System.out.println("受保护的构造方法 n = " + n);
    }

    //私有构造方法
    private Person(int age){
        System.out.println("私有的构造方法   年龄："+ age);
    }

    public void show1(String s){
        System.out.println("调用了：公有的，String参数的show1(): s = " + s);
    }
    protected void show2(){
        System.out.println("调用了：受保护的，无参的show2()");
    }
    void show3(){
        System.out.println("调用了：默认的，无参的show3()");
    }
    private String show4(int age){
        System.out.println("调用了，私有的，并且有返回值的，int参数的show4(): age = " + age);
        return "abcd";
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", sex=" + sex
                + ", phoneNum=" + phoneNum + "]";
    }

    public static void main(String[] args){
        System.out.println("main方法执行---+++");
    }
}

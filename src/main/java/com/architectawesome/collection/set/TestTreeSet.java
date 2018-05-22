package com.architectawesome.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by renwujie on 2018/05/22 at 14:19
 */
public class TestTreeSet {
    public static void main(String[] args){
        //自身元素具备比较性
        //ItemSelf();
        //自定义容器具备比较性
        comparatorSelf();
    }

    /**
     * 自定义容器具备比较性
     */
    private static void comparatorSelf() {
        TreeSet<Book> ts = new TreeSet<Book>(new MyConparator());
        ts.add(new Book("think in java", 100));
        ts.add(new Book("java 核心技术", 75));
        ts.add(new Book("现代操作系统", 50));
        ts.add(new Book("java就业教程", 35));
        ts.add(new Book("think in java", 100));
        ts.add(new Book("ccc in java", 100));
        ts.add(new Book("ccc in java", 10));
        ts.add(new Book("ccc in java", 55.5));

        System.out.println(ts);
    }

    /**
     * 元素自身具备比较性
     */
    private static void ItemSelf() {
        TreeSet<User> ts = new TreeSet<User>();
        ts.add(new User("aa", 20, "男"));
        ts.add(new User("bb", 18, "女"));
        ts.add(new User("cc", 17, "男"));
        ts.add(new User("dd", 17, "女"));
        ts.add(new User("dd", 15, "女"));
        ts.add(new User("dd", 15, "女"));


        System.out.println(ts);
        System.out.println(ts.size());
    }
}

/**
 * 元素自身具备比较性
 */
class User implements Comparable<User> {
    private String name;
    private int age;
    private String gender;

    public User() {

    }

    public User(String name, int age, String gender) {

        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println(this + "---equals---" + o);

        if (!(o instanceof User))
            return false;
        User u = (User) o;
        return this.name.equals(u.name) && this.age == u.age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age * 37;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public int compareTo(User o) {
        User u = (User) o;
        /*
        System.out.println(this + "compare to " + u);
        if (this.age > u.age) {
            return 1;
        }
        if (this.age < u.age) {
            return -1;
        }
        return this.name.compareTo(u.name);*/

        if(!this.name.equals(u.name)) {
            return this.name.compareTo(u.name);
        }

        //名字按升序，年龄按降序
        //return u.age - this.age;
        //名字按升序，年龄按升序
        return this.age = u.age;
    }
}

class MyConparator implements Comparator {

    public int compare(Object o1, Object o2) {
        Book b1 = (Book) o1;
        Book b2 = (Book) o2;
        System.out.println(b1 + "--compare to --" + b2);
        if(!b1.getName().equals(b2.getName())) {
            return b1.getName().compareTo(b2.getName());
        }
        return (int) (b1.getPrice() - b2.getPrice());
    }
}

class Book {
    private String name;
    private double price;

    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String name, double price) {

        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", price=" + price + "]";
    }
}
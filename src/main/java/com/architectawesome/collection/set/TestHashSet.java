package com.architectawesome.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by renwujie on 2018/05/22 at 14:19
 */
public class TestHashSet {
    public static void main(String[] args) {
        //testHashSet();
        //addSelfObject();
        testTreeSet();
    }

    /**
     * TreeSet：有序不重复
     */
    private static void testTreeSet() {
        Set<String> ts = new TreeSet<String>();
        ts.add("rwj");
        ts.add("zcy");
        ts.add("wz");
        ts.add("sx");
        System.out.println(ts);
    }

    private static void addSelfObject() {
        HashSet<Person> hs = new HashSet<Person>();
        hs.add(new Person("rwj", 20));
        hs.add(new Person("zcy", 20));
        hs.add(new Person("sx", 20));
        hs.add(new Person("wx", 20));
        hs.add(new Person("rwj", 20));
        hs.add(new Person("rwj", 25));

        Iterator<Person> it = hs.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);
        }
    }

    public static void testHashSet() {
        //Set集合,存和取顺序不一样，值不能不重复
        Set<String> hs = new HashSet<String>();
        hs.add("章晨煜");
        hs.add("司鑫");
        hs.add("任武杰");
        hs.add("王鑫");

        boolean isAdded = hs.add("任武杰");
        System.out.println(isAdded);

        Iterator<String> iterator = hs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        //java中==比较的是两个对象在内存中的地址
        if (this == o) return true;
        System.out.println(this + "---equals---" + o);
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode:" + this.name);
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

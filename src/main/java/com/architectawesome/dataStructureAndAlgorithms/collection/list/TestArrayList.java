package com.architectawesome.dataStructureAndAlgorithms.collection.list;

import java.text.Collator;
import java.util.*;

/**
 * Created by renwujie on 2018/05/23 at 13:12
 */
public class TestArrayList {
    public static void main(String[] args){
        //test1();
        //List list = throughDown();
        //remove1(list);
        //remove2(list);
        //System.out.println(list.size());
        //for(Object o : list) {
        //    System.out.println(o.toString());
        //}

        //sort();
        entitySort();
    }

    /**
     * 1.按顺序查找
     * 2.允许存储项为空
     * 3.允许多个存储项相等
     */
    static void test1() {
        List list = new ArrayList();
        list.add("zero");
        list.add(null);
        list.add("zero");
        list.add(null);
        list.add("three");
        System.out.println("index of null:" + list.indexOf(null));
        System.out.println("last index of null:" + list.lastIndexOf(null));
    }

    /**
     * 遍历
     */
    static List throughDown() {
        List<String> list = new ArrayList<>();
        list.add("rwj");
        list.add("sx");
        list.add("wx");

        System.out.println("第一种遍历方法 - >");
        for(String str : list) {
            System.out.println(str);
        }

        System.out.println("第二种遍历方法 - >");
        for(int i= 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("第三种遍历方法 - >");
        Iterator it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        return list;
    }

    /**
     * 我觉得无论时增强for循环还是for循环都不能用，因为会包concurrent..Exception
     * @param list
     */
    static void remove1(List list) {
        try {
            for(Object str : list) {
                if(str.equals("rwj"))
                    list.remove(str);
            }
        } catch (Exception e) {
            int i = 0;
            System.out.println("移除失败");
        }
    }

    /**
     * 遍历时删除元素的正确方式
     */
    static void remove2(List list) {
        Iterator it = list.iterator();
        while(it.hasNext()) {
            Object str = it.next();
            if(str.equals("rwj"))
                it.remove();
        }
    }

    /**
     * 中文排序
     */
    static void sort() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("一鸣惊人-Y");
        list.add("人山人海-R");
        list.add("海阔天空-H");
        list.add("空前绝后-K");
        list.add("后来居上-H");
        Comparator<Object> selfComparator = Collator.getInstance(java.util.Locale.CHINA);
        Collections.sort(list, selfComparator);
        for (String str : list) {
            System.out.println(str);
        }
    }

    /**
     * 实体类排序：
     *  1.让实体类本身能排序
     *  2.传入自定义排序器
     */
    static void entitySort() {
        List<User> userlist = new ArrayList<User>();
        userlist.add(new User("哈哈 ", 32));
        userlist.add(new User("噢哈哈", 22));
        userlist.add(new User("哇哈哈", 22));

        Collections.sort(userlist, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                //先按名字排
                int age = o1.getName().compareTo(o2.getName());
                //姓名一样比较年龄
                if(age != 0) {
                    return o1.getAge() - o2.getAge();
                }
                return 0;
            }
        });

        for(User user : userlist) {
            System.out.println(user.toString());
        }
    }
}

class User{
    private String name;
    private int age;

    public User(String name, int age) {
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
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
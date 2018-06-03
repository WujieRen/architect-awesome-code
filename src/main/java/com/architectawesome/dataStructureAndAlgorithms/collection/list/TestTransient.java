package com.architectawesome.dataStructureAndAlgorithms.collection.list;

import java.io.*;

/**
 * Created by renwujie on 2018/05/23 at 13:18
 * <p>
 * Java的sserialization提供了一种持久化对象的机制。当持久化对象时，如果其中有某个（些）数据成员不需要serialization，就可以用transient。可以达到在特定对象的一个域上关闭某数据成员的serialization。
 */
public class TestTransient {

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("rwj", "rwjpassword");
        System.out.println(userInfo);

        try {
            //序列化
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("userInfo.out"));
            out.writeObject(userInfo);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            //重新读取
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("userInfo.out"));
            UserInfo reUserInfo = (UserInfo) input.readObject();
            //发现读取后password的值为null，说明序列化时没有序列化password
            System.out.println(reUserInfo.toString());
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class UserInfo implements Serializable {
    private static final long serialVersionUID = 5964194245809038071L;
    private String name;
    private transient String password;

    public UserInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "TestTransient{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
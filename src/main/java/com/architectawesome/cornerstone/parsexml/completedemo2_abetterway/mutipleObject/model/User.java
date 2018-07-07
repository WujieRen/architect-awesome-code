package com.architectawesome.cornerstone.parsexml.completedemo2_abetterway.mutipleObject.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by renwujie on 2018/07/03 at 10:38
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "User")
//@XmlType(
//        propOrder = {
//                "userId",
//                "userName",
//                "password",
//                "birthday",
//                "money",
//                "computers"
//        }
//)
public class User implements Serializable{
    private static final long serialVersionUID = 4685165815748944114L;

    // 用户Id
    private int userId;
    // 用户名
    private String userName;
    // 用户密码
    private String password;
    // 用户生日
    private Date birthday;
    // 用户钱包
    private double money;
    // 拥有的电脑
    //private Computers computers;
    //@XmlElementWrapper(name = "computers")
    @XmlElement(name = "computers")
    //private List<Computer> computer;
    private Computer computer;

    public User() {
        super();
    }

    public User(int userId, String userName, String password, Date birthday,
                double money) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.birthday = birthday;
        this.money = money;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return (Date) birthday.clone();
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


    //public Computers getComputers() {
    //    return computers;
    //}
    //
    //public void setComputers(Computers computers) {
    //    this.computers = computers;
    //}


    //public List<Computer> getComputer() {
    //    return computer;
    //}
    //
    //public void setComputer(List<Computer> computer) {
    //    this.computer = computer;
    //}


    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "User [birthday=" + birthday + ", computers=" + computer
                + ", money=" + money + ", password=" + password + ", userId="
                + userId + ", userName=" + userName + "]";
    }
}

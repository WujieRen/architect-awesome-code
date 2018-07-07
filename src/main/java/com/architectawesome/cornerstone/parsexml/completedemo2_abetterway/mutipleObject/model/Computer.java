package com.architectawesome.cornerstone.parsexml.completedemo2_abetterway.mutipleObject.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by renwujie on 2018/07/03 at 10:38
 */
public class Computer implements Serializable {
    private static final long serialVersionUID = -2770397900459164369L;

    // 序列号
    private String serialNumber;
    // 品牌名
    private String brandName;
    // 生成日期
    private Date productDate;
    // 价格
    private double price;

    public Computer() {
        super();
    }

    public Computer(String serialNumber, String brandName, Date productDate,
                    double price) {
        super();
        this.serialNumber = serialNumber;
        this.brandName = brandName;
        this.productDate = productDate;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Date getProductDate() {
        return (Date) productDate.clone();
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "serialNumber='" + serialNumber + '\'' +
                ", brandName='" + brandName + '\'' +
                ", productDate=" + productDate +
                ", price=" + price +
                '}';
    }
}

package com.architectawesome.cornerstone.parsexml.acompletedemo.model;

import java.util.Date;

/**
 * Created by renwujie on 2018/07/02 at 11:08
 */
public class Book {
    /**
     * 图书编号
     */
    private String isbn;

    /**
     * 书名
     */
    private String name;

    /**
     * 作者
     */
    private String author;

    /**
     * 出版社
     */
    private String publishing;

    /**
     * 发布时间
     */
    private Date pubdate;

    /**
     * 价格
     */
    private double price;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public Date getPubdate() {
        return (Date) pubdate.clone();
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "name: " + name + " isbn: " + isbn + " author: " + author
                + " publishing: " + publishing + " pubdate: " + pubdate
                + " price: " + price;

    }
}
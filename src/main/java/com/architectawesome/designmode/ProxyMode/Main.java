package com.architectawesome.designmode.ProxyMode;

/**
 * Created by renwujie on 2018/06/14 at 10:38
 */
public class Main {
    public static void main(String[] args){
        BeautifulGirl bg = new BeautifulGirl("刘巧林");

        Girls girls = new Girls(bg);

        girls.giveBook();
        girls.giveChocolate();
        girls.giveFlowers();
    }
}

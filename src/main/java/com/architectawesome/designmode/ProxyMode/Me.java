package com.architectawesome.designmode.ProxyMode;

/**
 * Created by renwujie on 2018/06/14 at 10:38
 */
public class Me implements SendGift {

    BeautifulGirl bg;

    public Me(BeautifulGirl bg) {
        this.bg = bg;
    }

    public void giveBook() {
        System.out.println(bg.getName() +",送你一本书....");
    }

    public void giveChocolate() {
        System.out.println(bg.getName() + ",送你一盒巧克力....");
    }

    public void giveFlowers() {
        System.out.println(bg.getName() + ",送你一束花....");
    }
}

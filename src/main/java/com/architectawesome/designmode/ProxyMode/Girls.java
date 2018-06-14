package com.architectawesome.designmode.ProxyMode;

/**
 * Created by renwujie on 2018/06/14 at 10:38
 */
public class Girls implements SendGift{

    Me me;

    public Girls(BeautifulGirl bg) {
        this.me = new Me(bg);
    }

    @Override
    public void giveFlowers() {
        me.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        me.giveChocolate();
    }

    @Override
    public void giveBook() {
        me.giveBook();
    }
}

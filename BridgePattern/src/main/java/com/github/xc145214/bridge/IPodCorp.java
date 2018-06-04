package com.github.xc145214.bridge;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/4 0004 22:43
 */
public class IPodCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("我生产iPod...");
    }

    @Override
    protected void sell() {
        System.out.println("iPod畅销...");
    }

    //狂赚钱
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
}

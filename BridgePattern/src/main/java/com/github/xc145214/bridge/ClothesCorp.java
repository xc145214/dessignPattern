package com.github.xc145214.bridge;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/4 0004 22:41
 */
public class ClothesCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("服装公司生产衣服...");
    }

    @Override
    protected void sell() {
        System.out.println("服装公司出售衣服...");
    }

    //服装公司不景气，但怎么说也是赚钱行业也
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚小钱...");
    }
}

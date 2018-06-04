package com.github.xc145214.bridge;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/4 0004 22:51
 */
public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的房子是这个样子的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出去了...");
    }
}

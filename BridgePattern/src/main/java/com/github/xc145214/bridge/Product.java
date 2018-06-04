package com.github.xc145214.bridge;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/4 0004 22:49
 */
public abstract class Product {
    /**
     * 甭管是什么产品它总要是能被生产出来
     */
    public abstract void beProducted();

    /**
     * 生产出来的东西，一定要销售出去，否则扩本呀
     */
    public abstract void beSelled();
}

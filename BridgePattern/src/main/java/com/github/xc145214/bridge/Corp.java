package com.github.xc145214.bridge;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/4 0004 22:39
 */
public abstract class Corp {

    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    //公司是干什么的？赚钱的呀，不赚钱傻子才干
    public void makeMoney() {
        //每个公司都是一样，先生产
        this.product.beProducted();
        //然后销售
        this.product.beSelled();
    }

}

package com.github.xc145214.responsibilityChain.advance;

/**
 * @author xiac
 * @date 2018/7/4 0004
 */
public class Husband extends Handler {

    public Husband() {
        super(2);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("--------妻子向丈夫请示-------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是：同意\n");
    }
}

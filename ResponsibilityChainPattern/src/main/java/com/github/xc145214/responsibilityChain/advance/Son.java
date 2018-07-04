package com.github.xc145214.responsibilityChain.advance;

/**
 * @author xiac
 * @date 2018/7/4 0004
 */
public class Son extends Handler {


    public Son() {
        super(3);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是：同意\n");
    }
}

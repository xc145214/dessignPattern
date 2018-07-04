package com.github.xc145214.responsibilityChain.base;

/**
 * @author xiac
 * @date 2018/7/4 0004
 */
public class Son implements IHandler {
    //目前向儿子请示
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("母亲的请示是：" + women.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}

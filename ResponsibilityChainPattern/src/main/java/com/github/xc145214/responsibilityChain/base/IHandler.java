package com.github.xc145214.responsibilityChain.base;

/**
 * @author xiac
 * @date 2018/7/4 0004
 */
public interface IHandler {
    //一个女性（女儿，妻子或者是母亲）要求逛街，你要处理这个请求
    public void HandleMessage(IWomen women);
}

package com.github.xc145214.responsibilityChain.advance;

/**
 * @author xiac
 * @date 2018/7/4 0004
 */
public interface IWomen {

    /**
     * 获取个人状况。
     */
    public int getType();

    /**
     * 获得个人请示，你要干什么？出去逛街？约会?还是看电影.
     *
     * @return
     */
    public String getRequest();
}

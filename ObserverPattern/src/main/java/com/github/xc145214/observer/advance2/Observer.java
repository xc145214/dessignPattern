package com.github.xc145214.observer.advance2;

/**
 * @author xiac
 * @date 2018/7/3 0003
 */
public interface Observer {
    //一发现别人有动静，自己也要行动起来
    public void update(String context);
}

package com.github.xc145214.bridge;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/4 0004 22:43
 */
public class IPodCorp extends Corp {
    public IPodCorp(IPod product) {
        super(product);
    }

    //狂赚钱
    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
}

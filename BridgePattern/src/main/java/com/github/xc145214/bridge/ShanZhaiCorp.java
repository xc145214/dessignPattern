package com.github.xc145214.bridge;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/4 0004 22:57
 */
public class ShanZhaiCorp extends Corp {
    public ShanZhaiCorp(Product product) {
        super(product);
    }


    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
}

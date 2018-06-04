package com.github.xc145214.bridge;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/4 0004 22:41
 */
public class ClothesCorp extends Corp {

    public ClothesCorp(Clothes product) {
        super(product);
    }

    //服装公司不景气，但怎么说也是赚钱行业也
    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚小钱...");
    }
}

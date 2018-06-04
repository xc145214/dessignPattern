package com.github.xc145214.bridge;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/4 0004 22:40
 */
public class HouseCorp extends Corp {

    public HouseCorp(House house) {
        super(house);
    }

    //房地产公司很High了，赚钱，计算利润
    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }
}

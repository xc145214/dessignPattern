package com.github.xc145214;

import com.github.xc145214.bridge.House;
import com.github.xc145214.bridge.HouseCorp;
import com.github.xc145214.bridge.IPod;
import com.github.xc145214.bridge.IPodCorp;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/4 0004 22:43
 */
public class App2 {
    public static void main(String[] args) {
        System.out.println("-------房地产公司是这个样子运行的-------");
        //先找到我的公司
        HouseCorp houseCorp = new HouseCorp(new House());
        //看我怎么挣钱
        houseCorp.makeMoney();
        System.out.println("\n");
        System.out.println("-------山寨公司是这样运行的-------");
        IPodCorp iPodCorp = new IPodCorp(new IPod());
        iPodCorp.makeMoney();
    }
}

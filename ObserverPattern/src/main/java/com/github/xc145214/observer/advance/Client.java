package com.github.xc145214.observer.advance;


/**
 * @author xiac
 * @date 2018/7/3 0003
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        //定义出韩非子和李斯
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
//观察早餐

        //然后这里我们看看韩非子在干什么
        hanFeiZi.haveBreakfast();
//韩非子娱乐了
        hanFeiZi.haveFun();

    }
}

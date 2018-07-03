package com.github.xc145214.observer.advance;

/**
 * @author xiac
 * @date 2018/7/3 0003
 */
public class HanFeiZi {

    //把李斯声明出来
    private ILiSi liSi = new LiSi();

    //韩非子要吃饭了
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了...");
//通知李斯
        this.liSi.update("韩非子在吃饭");
    }

    //韩非子开始娱乐了,古代人没啥娱乐，你能想到的就那么多
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        this.liSi.update("韩非子在娱乐");
    }
}

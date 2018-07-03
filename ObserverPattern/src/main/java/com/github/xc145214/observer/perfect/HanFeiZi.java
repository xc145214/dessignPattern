package com.github.xc145214.observer.perfect;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * @author xiac
 * @date 2018/7/3 0003
 */
public class HanFeiZi extends Observable {
    //定义个变长数组，存放所有的观察者
    private ArrayList<Observer> observerList = new ArrayList<Observer>();


    //韩非子要吃饭了
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了...");
//通知所有的观察者
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    //韩非子开始娱乐了,古代人没啥娱乐，你能想到的就那么多
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        super.setChanged();
        this.notifyObservers("韩非子在娱乐");
    }
}

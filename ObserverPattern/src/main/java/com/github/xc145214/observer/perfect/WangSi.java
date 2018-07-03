package com.github.xc145214.observer.perfect;

import java.util.Observable;
import java.util.Observer;

/**
 * @author xiac
 * @date 2018/7/3 0003
 */
public class WangSi implements Observer {

    //一看李斯有活动，就哭，痛哭
    private void cry(String context) {
        System.out.println("王斯：因为" + context + "，——所以我悲伤呀！");
    }

    //王斯，看到韩非子有活动，自己就受不了
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("王斯：观察到韩非子活动，自己也开始活动了...");
        this.cry(arg.toString());
        System.out.println("王斯：真真的哭死了...\n");
    }
}

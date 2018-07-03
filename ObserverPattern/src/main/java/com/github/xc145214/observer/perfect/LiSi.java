package com.github.xc145214.observer.perfect;

import java.util.Observable;
import java.util.Observer;

/**
 * @author xiac
 * @date 2018/7/3 0003
 */
public class LiSi implements Observer {

    //汇报给秦始皇
    private void reportToQiShiHuang(String reportContext) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + reportContext);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯：观察到李斯活动，开始向老板汇报了...");
        this.reportToQiShiHuang(arg.toString());
        System.out.println("李斯：汇报完毕，秦老板赏给他两个萝卜吃吃...\n");

    }
}

package com.github.xc145214;

import com.github.xc145214.builder.BenzBuilder;
import com.github.xc145214.builder.BenzModel;
import com.github.xc145214.builder.BmwBuilder;
import com.github.xc145214.builder.BmwModel;

import java.util.ArrayList;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/4 0004
 */
public class App2 {

    public static void main(String[] args) {

        /**
         * 客户告诉牛叉公司，我要这样一个模型，然后牛叉公司就告诉我老大
         * 说要这样一个模型，这样一个顺序，然后我就来制造
         */
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();

        //客户要求，run的时候时候先发动引擎
        sequence.add("engine boom");
        //启动起来
        sequence.add("start");
        //开了一段就停下来
        sequence.add("stop");

        //要一个奔驰车：
        BenzBuilder benzBuilder = new BenzBuilder();
        //把顺序给这个builder类，制造出这样一个车出来
        benzBuilder.setSequence(sequence);
        //制造出一个奔驰车
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        //奔驰车跑一下看看
        benz.run();


        //按照同样的顺序，我再要一个宝马
        BmwBuilder bmwBuilder = new BmwBuilder();
        bmwBuilder.setSequence(sequence);
        BmwModel bmw = (BmwModel) bmwBuilder.getCarModel();
        bmw.run();
    }
}

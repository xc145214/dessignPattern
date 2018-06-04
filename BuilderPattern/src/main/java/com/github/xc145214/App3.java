package com.github.xc145214;

import com.github.xc145214.builder.Director;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/4 0004 22:27
 */
public class App3 {

    public static void main(String[] args) {
        Director director = new Director();
        //1W辆A类型的奔驰车
        for (int i = 0; i < 10000; i++) {
            director.getABenzModel().run();
        }
        //100W辆B类型的奔驰车
        for (int i = 0; i < 1000000; i++) {
            director.getBBenzModel().run();
        }
        //1000W量C类型的宝马车
        for (int i = 0; i < 10000000; i++) {
            director.getCBmwModel().run();
        }
    }
}

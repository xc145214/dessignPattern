package com.github.xc145214;

import com.github.xc145214.singleton.Emperor;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //第一天
        Emperor emperor1 = Emperor.getInstance();
        emperor1.emperorInfo(); //第一天见的皇帝叫什么名字呢？
        //第二天
        Emperor emperor2 = Emperor.getInstance();
        Emperor.emperorInfo();
        //第三天
        Emperor emperor3 = Emperor.getInstance();
        emperor2.emperorInfo();

    }
}

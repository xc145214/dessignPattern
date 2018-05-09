package com.github.xc145214.singleton;

public class Emperor {
    private static final Emperor emperor = new Emperor();
    ;

    private Emperor() {
//世俗和道德约束你，目的就是不让你产生第二个皇帝
    }

    public static Emperor getInstance() {
        return emperor;
    }

    //皇帝叫什么名字呀
    public static void emperorInfo() {
        System.out.println("我就是皇帝某某某....");
    }
}

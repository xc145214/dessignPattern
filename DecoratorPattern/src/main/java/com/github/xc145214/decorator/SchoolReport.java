package com.github.xc145214.decorator;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/7 0007 22:13
 */
public abstract class SchoolReport {

    //成绩单的主要展示的就是你的成绩情况
    public abstract void report();

    //成绩单要家长签字，这个是最要命的
    public abstract void sign(String name);
}

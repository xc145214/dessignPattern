package com.github.xc145214.decorator;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/7 0007 22:25
 */
public abstract class Decorator extends SchoolReport {

    //首先我要知道是那个成绩单
    private SchoolReport sr;

    //构造函数，传递成绩单过来
    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    //成绩单还是要被看到的
    @Override
    public void report() {
        this.sr.report();
    }

    //看完毕还是要签名的
    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}

package com.github.xc145214.decorator;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/7 0007 22:14
 */
public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        //成绩单的格式是这个样子的
        System.out.println("尊敬的XXX家长:");
        System.out.println(" ......");
        System.out.println(" 语文 62 数学65 体育 98 自然 63");
        System.out.println(" .......");
        System.out.println(" 家长签名： ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为：" + name);
    }
}

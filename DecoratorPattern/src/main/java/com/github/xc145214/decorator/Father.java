package com.github.xc145214.decorator;

/**
 * @author xiac xc145214@gmail.com
 * @desc
 * @date 2018/6/7 0007 22:16
 */
public class Father {

    public static void main(String[] args) {
        //成绩单拿过来
        SchoolReport schoolReport = new FouthGradeSchoolReport();

        //看成绩单
        schoolReport.report();

        //签名休想

    }
}

package com.github.xc145214.decorator;

/**
 * @author xiac xc145214@gmail.com
 * @desc
 * @date 2018/6/7 0007 22:16
 */
public class Father {

    public static void main(String[] args) {
        //美化过的成绩单拿过来
//        SchoolReport sr= new FouthGradeSchoolReport();
        SchoolReport sr = new SugarFouthGradeSchoolReport();
        //看成绩单
        sr.report();
        //然后老爸，一看，很开心，就签名了
        sr.sign("老三"); //我叫小三，老爸当然叫老三

    }
}

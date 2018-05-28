package com.github.xc145214;

import com.github.xc145214.templateMethod.HummerH1Model;
import com.github.xc145214.templateMethod.HummerH2Model;
import com.github.xc145214.templateMethod.HummerModel;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //客户开着H1型号，出去遛弯了
        HummerModel h1 = new HummerH1Model();
        h1.run(); //汽车跑起来了；

        //客户开H2型号，出去玩耍了
        HummerH2Model h2 = new HummerH2Model();
        h2.setAlarmFlag(true);
        h2.run();
    }
}

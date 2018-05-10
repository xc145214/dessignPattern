package com.github.xc145214;

import com.github.xc145214.abstractFactory.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleHumanFactory();
        //第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleHumanFactory();

        //生产线建立完毕，开始生产人了:
        Human maleYellowHuman = maleHumanFactory.createYellowHuman(HumanEnum.YelloMaleHuman);
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman(HumanEnum.YelloFemaleHuman);


        maleYellowHuman.cry();
        maleYellowHuman.laugh();
        femaleYellowHuman.sex();
    }
}

package com.github.xc145214.abstractFactory;

public class FemaleHumanFactory extends AbstractHumanFactory {

    //创建一个女性黄种人
    @Override
    public Human createYellowHuman(HumanEnum humanEnum) {
        return createHuman(HumanEnum.YelloFemaleHuman);
    }

    //创建一个女性白种人
    @Override
    public Human createWhiteHuman(HumanEnum humanEnum) {
        return createHuman(HumanEnum.WhiteFemaleHuman);
    }

    //创建一个女性黑种人
    @Override
    public Human createBlackHuman(HumanEnum humanEnum) {
        return createHuman(HumanEnum.BlackFemaleHuman);
    }
}

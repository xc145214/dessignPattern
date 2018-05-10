package com.github.xc145214.abstractFactory;

public class MaleHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createYellowHuman(HumanEnum humanEnum) {
        return createHuman(HumanEnum.YelloMaleHuman);
    }

    @Override
    public Human createWhiteHuman(HumanEnum humanEnum) {
        return createHuman(HumanEnum.WhiteMaleHuman);
    }

    @Override
    public Human createBlackHuman(HumanEnum humanEnum) {
        return createHuman(HumanEnum.BlackMaleHuman);
    }
}

package com.github.xc145214.abstractFactory;

public interface HumanFactory {

    //制造黄色人种
    Human createYellowHuman(HumanEnum humanEnum);

    //制造一个白色人种
    Human createWhiteHuman(HumanEnum humanEnum);

    //制造一个黑色人种
    Human createBlackHuman(HumanEnum humanEnum);
}

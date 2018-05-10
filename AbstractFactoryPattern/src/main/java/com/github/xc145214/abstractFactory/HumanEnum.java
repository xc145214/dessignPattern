package com.github.xc145214.abstractFactory;

public enum HumanEnum {

    //把世界上所有人类型都定义出来
    YelloMaleHuman("com.github.xc145214.abstractFactory.YellowMaleHuman"),
    YelloFemaleHuman("com.github.xc145214.abstractFactory.YellowFemaleHuman"),
    WhiteFemaleHuman("com.github.xc145214.abstractFactoryWhiteFemaleHuman"),
    WhiteMaleHuman("com.github.xc145214.abstractFactory.WhiteMaleHuman"),
    BlackFemaleHuman("com.github.xc145214.abstractFactory.BlackFemaleHuman"),
    BlackMaleHuman("com.github.xc145214.abstractFactory.BlackMaleHuman");

    private String value = "";

    public String getValue() {
        return value;
    }

    HumanEnum(String value) {
        this.value = value;
    }

}

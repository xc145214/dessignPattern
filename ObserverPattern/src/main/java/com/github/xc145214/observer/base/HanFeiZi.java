package com.github.xc145214.observer.base;

/**
 * @author xiac
 * @date 2018/7/3 0003
 */
public class HanFeiZi implements IHanFeiZi {
    //韩非子是否在吃饭，作为监控的判断标准
    private boolean isHaveBreakfast = false;
    //韩非子是否在娱乐
    private boolean isHaveFun = false;

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了...");
        this.isHaveBreakfast = true;
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        this.isHaveFun = true;
    }

    public boolean isHaveBreakfast() {
        return isHaveBreakfast;
    }

    public void setHaveBreakfast(boolean haveBreakfast) {
        isHaveBreakfast = haveBreakfast;
    }

    public boolean isHaveFun() {
        return isHaveFun;
    }

    public void setHaveFun(boolean haveFun) {
        isHaveFun = haveFun;
    }
}

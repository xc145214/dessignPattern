package com.github.xc145214.templateMethod;

public class HummerH2Model extends HummerModel {
    private boolean alarmFlag = true; //是否要响喇叭

    @Override
    public void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样在...");
    }

    /**
     * 是否有喇叭有客户决定。
     *
     * @param alarmFlag
     */
    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }
}

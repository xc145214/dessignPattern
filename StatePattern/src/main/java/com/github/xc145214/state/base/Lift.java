package com.github.xc145214.state.base;

/**
 * @author xiac
 * @date 2018/7/5 0005
 */
public class Lift implements ILift {
    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }

    @Override
    public void run() {
        System.out.println("电梯上下跑起来...");
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }
}

package com.github.xc145214.state.extend;

/**
 * @author xiac
 * @date 2018/7/5 0005
 */
public class RunningState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯上下跑...");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState); //环境设置为停止状态；
        super.context.getLiftState().stop();
    }
}

package com.github.xc145214.state.advance;

/**
 * @author xiac
 * @date 2018/7/5 0005
 */
public interface ILift {
    //电梯的四个状态
    int OPENING_STATE = 1; //门敞状态
    int CLOSING_STATE = 2; //门闭状态
    int RUNNING_STATE = 3; //运行状态
    int STOPPING_STATE = 4; //停止状态；

    //设置电梯的状态
    void setState(int state);

    //首先电梯门开启动作
    void open();

    //电梯门有开启，那当然也就有关闭了
    void close();

    //电梯要能上能下，跑起来
    void run();

    //电梯还要能停下来，停不下来那就扯淡了
    void stop();
}

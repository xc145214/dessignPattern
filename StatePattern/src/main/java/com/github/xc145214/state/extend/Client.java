package com.github.xc145214.state.extend;

/**
 * @author xiac
 * @date 2018/7/5 0005
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}

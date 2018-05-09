package com.github.xc145214.strategy;

public class Context {

    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void operate() {
        iStrategy.operate();
    }
}

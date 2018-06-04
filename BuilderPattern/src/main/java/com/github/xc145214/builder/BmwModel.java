package com.github.xc145214.builder;

/**
 * @authro xiac xc145214@gmail.com
 * @date 2018/6/4 0004
 */
public class BmwModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车跑起来是这个样子的...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车应该这样停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭声音是这个样子的...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎是这个声音的...");
    }
}

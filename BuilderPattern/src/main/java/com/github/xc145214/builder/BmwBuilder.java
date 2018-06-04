package com.github.xc145214.builder;

import java.util.ArrayList;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/4 0004
 */
public class BmwBuilder extends CarBuilder {

    private BmwModel bmw = new BmwModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bmw;
    }
}

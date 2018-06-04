package com.github.xc145214.builder;

import java.util.ArrayList;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/4 0004
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return benz;
    }
}

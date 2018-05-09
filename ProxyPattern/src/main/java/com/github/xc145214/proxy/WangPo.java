package com.github.xc145214.proxy;

public class WangPo implements KindWomen {

    private KindWomen kindWomen;

    /**
     * 默认是潘金莲的代理。
     */
    public WangPo() {//
        this.kindWomen = new PanJinLian();
    }

    /**
     * 也可以是别的代理。
     *
     * @param kindWomen {@link KindWomen}
     */
    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        kindWomen.happyWithMan();
    }
}

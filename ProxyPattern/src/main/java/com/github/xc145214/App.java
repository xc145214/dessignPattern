package com.github.xc145214;

import com.github.xc145214.proxy.JiaShi;
import com.github.xc145214.proxy.WangPo;

/**
 * 代理模式的入口。
 */
public class App {


    public static void main(String[] args) {

        /**
         * 王婆代理潘金莲。
         */
        WangPo wangPo = new WangPo();

        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();

        /**
         * 王婆代理贾氏。
         */
        JiaShi jiaShi = new JiaShi();
        WangPo wangPo1 = new WangPo(jiaShi);

        wangPo1.makeEyesWithMan();
        wangPo1.happyWithMan();
    }
}

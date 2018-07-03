package com.github.xc145214.advance;

import java.util.ArrayList;

/**
 * @author xiac
 * @date 2018/7/3 0003
 */
public interface IBranch {

    //能够增加小兵(树叶节点）或者是经理（树枝节点）
    public void addSubordinate(ICorp corp);

    //我还要能够获得下属的信息
    public ArrayList<ICorp> getSubordinate();

    /**
     * 本来还应该有一个方法delSubordinate(ICorp corp)，删除下属
     * 这个方法我们没有用到就不写进来了
     */
}

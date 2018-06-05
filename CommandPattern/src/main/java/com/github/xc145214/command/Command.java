package com.github.xc145214.command;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/5 0005 22:55
 */
public abstract class Command {

    /**
     * 把三个组都定义好，子类可以直接使用
     */
    /**
     * 需求组
     */
    protected RequirementGroup rg = new RequirementGroup();

    /**
     * 美工组
     */
    protected PageGroup pg = new PageGroup();

    /**
     * 代码组;
     */
    protected CodeGroup cg = new CodeGroup();

    /**
     * 只要一个方法，你要我做什么事情
     */
    public abstract void execute();
}

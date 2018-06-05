package com.github.xc145214.command;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/5 0005 22:57
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        //找到需求组
        super.rg.find();
        //增加一份需求
        super.rg.add();
        // 页面也要增加
        super.pg.add();
        // 功能也要增加
        super.cg.add();
        //给出计划
        super.rg.plan();
    }
}

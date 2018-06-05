package com.github.xc145214.command;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/5 0005 22:58
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        //找到页面组
        super.pg.find();
        //删除一个页面
        super.rg.delete();
        //给出计划
        super.rg.plan();
    }
}

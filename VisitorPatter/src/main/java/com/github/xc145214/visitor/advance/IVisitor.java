package com.github.xc145214.visitor.advance;


/**
 * @author xiac
 * @date 2018/7/4 0004
 */
public interface IVisitor {
    //首先定义我可以访问普通员工
    public void visit(CommonEmployee commonEmployee);

    /**
     * 访问部门经理。
     *
     * @param manager
     */
    public void visit(Manager manager);
}

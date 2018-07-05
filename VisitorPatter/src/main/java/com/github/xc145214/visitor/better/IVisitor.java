package com.github.xc145214.visitor.better;

/**
 * @author xiac
 * @date 2018/7/5 0005
 */
public interface IVisitor {
    // 首先定义我可以访问普通员工
    public void visit(CommonEmployee commonEmployee);

    // 其次定义，我还可以访问部门经理
    public void visit(Manager manager);
}

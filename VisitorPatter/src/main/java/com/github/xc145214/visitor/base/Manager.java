package com.github.xc145214.visitor.base;

/**
 * @author xiac
 * @date 2018/7/4 0004
 */
public class Manager extends Employee {

    //这类人物的职责非常明确：业绩
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    protected String getOtherInfo() {
        return "业绩：" + this.performance + "\t";
    }
}

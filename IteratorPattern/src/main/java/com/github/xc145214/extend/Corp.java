package com.github.xc145214.extend;

/**
 * @author xiac
 * @date 2018/7/3 0003
 */
public abstract class Corp {

    // 公司每个人都有名称
    private String name = "";
    // 公司每个人都职位
    private String position = "";
    // 公司每个人都有薪水
    private int salary = 0;
    // 父节点是谁
    private Corp parent = null;

    /* 通过接口的方式传递，我们改变一下习惯，传递进来的参数名以下划线开始
     * 这个在一些开源项目中非常常见，一般构造函数都是定义的
     */
    public Corp(String _name, String _position, int _salary) {
        this.name = _name;
        this.position = _position;
        this.salary = _salary;
    }

    // 获得员工信息
    public String getInfo() {
        String info = "";
        info = " 姓名： " + this.name;
        info = info + "\t 职位： " + this.position;
        info = info + "\t 薪水： " + this.salary;
        if (this.parent != null) {
            info = info + "\t 上级： " + this.parent.getName();
        }
        return info;
    }

    public Corp getParent() {
        return parent;
    }

    public void setParent(Corp parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }
}

package com.github.xc145214.advance;

/**
 * @author xiac
 * @date 2018/7/3 0003
 */
public class Leaf implements ICorp {
    //小兵也有名称
    private String name = "";
    //小兵也有职位
    private String position = "";
    //小兵也有薪水，否则谁给你干
    private int salary = 0;

    //通过一个构造函数传递小兵的信息
    public Leaf(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    //获得小兵的信息
    public String getInfo() {
        String info = "";
        info = "姓名：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }
}

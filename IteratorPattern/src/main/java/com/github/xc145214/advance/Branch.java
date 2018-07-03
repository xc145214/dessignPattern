package com.github.xc145214.advance;

import java.util.ArrayList;

/**
 * @author xiac
 * @date 2018/7/3 0003
 */
public class Branch implements IBranch, ICorp {

    //领导也是人，也有名字
    private String name = "";
    //领导和领导不同，也是职位区别
    private String position = "";
    //领导也是拿薪水的
    private int salary = 0;
    //领导下边有那些下级领导和小兵
    ArrayList<ICorp> subordinateList = new ArrayList<ICorp>();

    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void addSubordinate(ICorp corp) {
        this.subordinateList.add(corp);
    }

    @Override
    public ArrayList<ICorp> getSubordinate() {
        return this.subordinateList;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "姓名：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }
}

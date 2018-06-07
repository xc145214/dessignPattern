package com.github.xc145214.iterator;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/7 0007 22:39
 */
public interface IProject {

    //增加项目
    public void add(String name, int num, int cost);

    //从老板这里看到的就是项目信息
    public String getProjectInfo();

    //获得一个可以被遍历的对象
    public IProjectIterator iterator();
}

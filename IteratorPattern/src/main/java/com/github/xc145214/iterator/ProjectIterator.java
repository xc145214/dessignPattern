package com.github.xc145214.iterator;

import java.util.ArrayList;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/7 0007 22:47
 */
public class ProjectIterator implements IProjectIterator {

    //所有的项目都放在这里ArrayList中
    private ArrayList<IProject> projectList = new ArrayList<IProject>();
    private int currentItem = 0;

    //构造函数传入projectList
    public ProjectIterator(ArrayList<IProject> projectList) {
        this.projectList = projectList;
    }

    @Override
    public boolean hasNext() {
        //定义一个返回值
        boolean b = true;
        if (this.currentItem >= projectList.size() ||
                this.projectList.get(this.currentItem) == null) {
            b = false;
        }
        return b;
    }

    @Override
    public Object next() {
        return (IProject) this.projectList.get(this.currentItem++);
    }
}

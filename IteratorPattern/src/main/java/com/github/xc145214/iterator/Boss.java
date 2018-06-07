package com.github.xc145214.iterator;

/**
 * @author xiac xc145214@gmail.com
 * @date 2018/6/7 0007 22:41
 */
public class Boss {

    public static void main(String[] args) {


//定义一个List，存放所有的项目对象
        IProject projectList = new Project();
//增加星球大战项目
        projectList.add("星球大战项目", 10, 100000);
//增加扭转时空项目
        projectList.add("扭转时空项目", 100, 10000000);
//增加超人改造项目
        projectList.add("超人改造项目", 10000, 1000000000);
//这边100个项目
        for (int i = 4; i < 104; i++) {
            projectList.add("第" + i + "个项目", i * 5, i * 1000000);
        }
//遍历一下ArrayList，把所有的数据都取出
        IProjectIterator projectIterator = projectList.iterator();
        while (projectIterator.hasNext()) {
            IProject p = (IProject) projectIterator.next();
            System.out.println(p.getProjectInfo());
        }

    }
}

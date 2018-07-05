package com.github.xc145214.prototype.clone;

import java.util.ArrayList;

/**
 * @author xiac
 * @date 2018/7/5 0005
 */
public class LightClient {

    static class Thing implements Cloneable{

        private ArrayList<String> arrayList = new ArrayList<>(12);

        @Override
        protected Thing clone()  {
            Thing thing = null;
            try {
                thing= (Thing) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return thing;
        }
        //设置HashMap的值
        public void setValue(String value){
            this.arrayList.add(value);
        }
        //取得arrayList的值
        public ArrayList<String> getValue(){
            return this.arrayList;
        }
    }
    public static void main(String[] args) {

        //产生一个对象
        Thing thing = new Thing();
//设置一个值
        thing.setValue("张三");
//拷贝一个对象
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
    }
}

package com.github.xc145214.prototype.clone;

/**
 * @author xiac
 * @date 2018/7/5 0005
 *
 */
public class SimpleClient {

    static class Thing implements Cloneable {

        public Thing() {
            System.out.println("构造函数被执行了...");
        }

        @Override
        protected Thing clone() {
            Thing thing = null;
            try {
                thing = (Thing) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return thing;
        }
    }

    public static void main(String[] args) {
        //产生一个对象
        Thing thing = new Thing();
        //拷贝一个对象
        /**
         * 构造方法不会重新执行。
         */
        Thing cloneThing = thing.clone();
    }


}


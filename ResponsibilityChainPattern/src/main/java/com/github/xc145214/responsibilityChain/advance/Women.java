package com.github.xc145214.responsibilityChain.advance;

/**
 * @author xiac
 * @date 2018/7/4 0004
 */
public class Women implements IWomen {

    /*
     * 通过一个int类型的参数来描述妇女的个人状况
     * 1---未出嫁
     * 2---出嫁
     * 3---夫死
     */
    private int type = 0;
    //妇女的请示
    private String request = "";


    public Women(int type, String _request) {
        this.type = type;
        //为了显示好看点，我在这里做了点处理
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是：" + _request;
                break;
            case 2:
                this.request = "妻子的请求是：" + _request;
                break;
            case 3:
                this.request = "母亲的请求是：" + _request;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}

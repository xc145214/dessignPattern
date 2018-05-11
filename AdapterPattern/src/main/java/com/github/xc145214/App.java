package com.github.xc145214;

import com.github.xc145214.adapter.IUserInfo;
import com.github.xc145214.adapter.OtherUserInfo;
import com.github.xc145214.adapter.OuterUserInfo;
import com.github.xc145214.adapter.UserInfo;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //没有与外系统连接的时候，是这样写的
//        IUserInfo youngGirl = new UserInfo();

        //与外面系统连接的时候
//        IUserInfo youngGirl = new OuterUserInfo(); //我们只修改了这一句好
        IUserInfo youngGirl = new OtherUserInfo();
//从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }
}

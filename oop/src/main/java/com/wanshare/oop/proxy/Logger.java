package com.wanshare.oop.proxy;

/**
 * @ClassName Logger
 * @Description: 日志记录类，业务类，它提供方法Log()来保存日志。
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 10:01
 */
public class Logger {

    public void log(String userName) {
        System.out.println(String.format("更新数据库，用户%s查询次数加1",userName));
    }

}

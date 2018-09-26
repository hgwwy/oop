package com.wanshare.oop.proxyDynamic.dynamic;

import com.wanshare.oop.proxyDynamic.Hello;
import com.wanshare.oop.proxyDynamic.HelloImpl;

/**
 * @ClassName Client
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-25 11:56
 */
public class Client {
    public static void main(String[] args) {
        Hello proxy = new DynamicProxy(new HelloImpl()).getProxy();
        proxy.say("王文洋");
    }
}

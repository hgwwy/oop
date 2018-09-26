package com.wanshare.oop.proxyDynamic.cglib;

import com.wanshare.oop.proxyDynamic.Hello;
import com.wanshare.oop.proxyDynamic.HelloImpl;

/**
 * @ClassName Client
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-25 14:45
 */
public class Client {
    public static void main(String[] args) {
        Hello hello = CglibDynamicProxy.getInstance().getProxy(HelloImpl.class);
        hello.say("wwy");
    }
}

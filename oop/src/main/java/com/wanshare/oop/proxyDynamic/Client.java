package com.wanshare.oop.proxyDynamic;

/**
 * @ClassName Client
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-25 11:48
 */
public class Client {
    public static void main(String[] args) {
         Hello hello = new ProxyHello();
         hello.say("王文洋");
    }
}

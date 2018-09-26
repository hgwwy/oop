package com.wanshare.oop.proxyDynamic;

/**
 * @ClassName ProxyHello
 * @Description: hello的代理类
 * @Auther: WenYang Wang
 * @Date: 2018-9-25 11:46
 */
public class ProxyHello implements Hello{

    private Hello hello;

    @Override
    public void say(String name) {
        befor();
        hello = new HelloImpl();
        hello.say(name);
        after();
    }

    private void befor(){
        System.out.println("befor");
    }

    private void after(){
        System.out.println("after");
    }
}

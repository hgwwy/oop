package com.wanshare.oop.proxyDynamic;

/**
 * @ClassName HelloImpl
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-25 11:45
 */
public class HelloImpl implements Hello {
    @Override
    public void say(String name) {
        System.out.println("你好," + name);
    }
}

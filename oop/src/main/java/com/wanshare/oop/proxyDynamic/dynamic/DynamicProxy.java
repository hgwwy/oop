package com.wanshare.oop.proxyDynamic.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName DynamicProxy
 * @Description: jdk动态代理,针对整个类的代理，如果类没有实现接口就没办法
 * @Auther: WenYang Wang
 * @Date: 2018-9-25 11:50
 */
public class DynamicProxy implements InvocationHandler {

    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    @SuppressWarnings("unchecked")
    public <T>T getProxy(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        befor();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    private void befor(){
        System.out.println("befor");
    }

    private void after(){
        System.out.println("after");
    }

}

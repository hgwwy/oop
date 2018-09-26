package com.wanshare.oop.proxyDynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName CglibDynamicProxy
 * @Description: DGLib动态代理，针对方法的代理，不用实现接口
 * @Auther: WenYang Wang
 * @Date: 2018-9-25 14:39
 */
public class CglibDynamicProxy implements MethodInterceptor {

    private static CglibDynamicProxy instance = new CglibDynamicProxy();

    private CglibDynamicProxy() {
    }

    public static CglibDynamicProxy getInstance(){
        return instance;
    }

    @SuppressWarnings("unchecked")
    public <T>T getProxy(Class<T> cls){
        return (T) Enhancer.create(cls, this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        befor();
        Object result = methodProxy.invoke(o, args);
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

package com.wanshare.oop.factory;

/**
 * @ClassName SpringButton
 * @Description: 具体产品
 * @Auther: WenYang Wang
 * @Date: 2018-9-13 11:37
 */
public class SpringButton implements Button{
    @Override
    public void display() {
        System.out.println("显示绿色按钮");
    }
}

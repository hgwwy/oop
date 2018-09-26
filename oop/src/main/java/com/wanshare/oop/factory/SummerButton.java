package com.wanshare.oop.factory;

/**
 * @ClassName SummerButton
 * @Description: 具体产品
 * @Auther: WenYang Wang
 * @Date: 2018-9-13 11:38
 */
public class SummerButton implements Button{
    @Override
    public void display() {
        System.out.println("显示蓝色按钮");
    }
}

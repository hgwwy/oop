package com.wanshare.oop.strategy;

/**
 * @ClassName StudentDiscount
 * @Description: 学生票折扣类：具体策略类
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 17:20
 */
public class StudentDiscount implements Discount{
    @Override
    public double calculate(double price) {
        System.out.println("学生票八折：");
        return price * 0.8;
    }
}

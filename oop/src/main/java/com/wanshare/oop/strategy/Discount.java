package com.wanshare.oop.strategy;

/**
 * @ClassName Discount
 * @Description: 折扣类：抽象策略类
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 17:20
 */
public interface Discount {
    double calculate(double price);
}

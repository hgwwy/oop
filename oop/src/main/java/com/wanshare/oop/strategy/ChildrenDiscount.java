package com.wanshare.oop.strategy;

/**
 * @ClassName ChildrenDiscount
 * @Description: 儿童票折扣类：具体策略类
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 17:20
 */
public class ChildrenDiscount implements Discount{
    @Override
    public double calculate(double price) {
        System.out.println("儿童票-10块：");
        return price - 10;
    }
}

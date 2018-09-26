package com.wanshare.oop.strategy;

/**
 * @ClassName VIPDiscount
 * @Description: vip票折扣类：具体策略类
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 17:21
 */
public class VIPDiscount implements Discount{
    @Override
    public double calculate(double price) {
        System.out.println("VIP票五折：");
        return price * 0.5;
    }
}

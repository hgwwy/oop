package com.wanshare.oop.strategy;

/**
 * @ClassName MovieTicket
 * @Description: 电影票类：环境类
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 17:20
 */
public class MovieTicket {

    private double price; //价格
    private Discount discount; //折扣策略对象

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    //注入一个折扣类对象
    public double getPrice() {
        return this.discount.calculate(this.price);
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

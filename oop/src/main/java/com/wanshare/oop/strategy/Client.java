package com.wanshare.oop.strategy;

/**
 * @ClassName Client
 * @Description: Sunny软件公司为某电影院开发了一套影院售票系统，在该系统中需要为不同类型的用户提供不同的电影票打折方式，具体打折方案如下：
 * (1) 学生凭学生证可享受票价8折优惠；
 * (2) 年龄在10周岁及以下的儿童可享受每张票减免10元的优惠（原始票价需大于等于20元）；
 * (3) 影院VIP用户除享受票价半价优惠外还可进行积分，积分累计到一定额度可换取电影院赠送的奖品。
 * 该系统在将来可能还要根据需要引入新的打折方式。
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 17:28
 */
public class Client {
    public static void main(String[] args) {
        double oldPrice = 100.0;
        double currentPrice;

        MovieTicket mt = new MovieTicket();
        mt.setPrice(oldPrice);

        System.out.println("原始价为：" + oldPrice);
        System.out.println("---------------------------------");

        mt.setDiscount(new VIPDiscount());
        System.out.println("折后价："+mt.getPrice());
    }
}

package com.wanshare.oop.template;

/**
 * @ClassName CurrentAccount
 * @Description: 活期账户
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 17:37
 */
public class CurrentAccount extends Account{

    @Override
    public void calculateInterest() {
        System.out.println("按活期利率计算利息！");
    }
}

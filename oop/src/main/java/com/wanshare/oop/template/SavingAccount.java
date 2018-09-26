package com.wanshare.oop.template;

/**
 * @ClassName SavingAccount
 * @Description: 定期账户
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 17:37
 */
public class SavingAccount extends Account{
    @Override
    public void calculateInterest() {
        System.out.println("按定期利率计算利息！");
    }
}

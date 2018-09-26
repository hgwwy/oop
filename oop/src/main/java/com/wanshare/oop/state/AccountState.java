package com.wanshare.oop.state;

/**
 * @ClassName AccountState
 * @Description: 账户状态抽象类
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 16:08
 */
public abstract class AccountState {
    protected Account account;
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract void computeInterest();
    abstract void stateCheck();
}

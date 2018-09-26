package com.wanshare.oop.state;

/**
 * @ClassName RestrictedState
 * @Description: 受限状态：具体状态类
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 16:10
 */
public class RestrictedState extends AccountState{

    public RestrictedState(AccountState state){
        this.account = state.account;
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        System.out.println("帐号受限，取款失败");
    }

    public void computeInterest() {
        System.out.println("计算利息！");
    }

    @Override
    void stateCheck() {
        if(account.getBalance() > 0) {
            account.setState(new NormalState(this));
        }
        else if(account.getBalance() > -2000) {
            account.setState(new OverdraftState(this));
        }
    }
}

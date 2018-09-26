package com.wanshare.oop.state;

/**
 * @ClassName OverdraftState
 * @Description: 透支状态：具体状态类
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 16:10
 */
public class OverdraftState extends AccountState{

    public OverdraftState(AccountState state) {
        this.account = state.account;
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        stateCheck();
    }

    public void computeInterest() {
        System.out.println("计算利息！");
    }

    @Override
    void stateCheck() {
        if (account.getBalance() > 0) {
            account.setState(new NormalState(this));
        }
        else if (account.getBalance() == -2000) {
            account.setState(new RestrictedState(this));
        }
        else if (account.getBalance() < -2000) {
            System.out.println("操作受限！");
        }
    }
}

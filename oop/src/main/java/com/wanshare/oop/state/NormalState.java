package com.wanshare.oop.state;

/**
 * @ClassName NormalState
 * @Description: 正常状态：具体状态类
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 16:09
 */
public class NormalState extends AccountState{

    public NormalState(Account account) {
        this.account = account;
    }

    public NormalState(AccountState state) {
        this.account = state.account;
    }

    @Override
    void deposit(double amount) {
        account.setBalance(account.getBalance()+amount);
        stateCheck();
    }

    @Override
    void withdraw(double amount) {
        account.setBalance(account.getBalance()-amount);
        stateCheck();
    }

    @Override
    void computeInterest() {
        System.out.println("正常状态，无须支付利息！");
    }

    /**
     * (1) 如果账户中余额大于等于0，则账户的状态为正常状态(Normal State)，此时用户既可以向该账户存款也可以从该账户取款；
     * (2) 如果账户中余额小于0，并且大于-2000，则账户的状态为透支状态(Overdraft State)，此时用户既可以向该账户存款也可以从该账户取款，但需要按天计算利息；
     * (3) 如果账户中余额等于-2000，那么账户的状态为受限状态(Restricted State)，此时用户只能向该账户存款，不能再从中取款，同时也将按天计算利息；
     *
     */
    @Override
    void stateCheck() {
        if (account.getBalance() > -2000 && account.getBalance() <= 0) {
            account.setState(new OverdraftState(this));
        }
        else if (account.getBalance() == -2000) {
            account.setState(new RestrictedState(this));
        }
        else if (account.getBalance() < -2000) {
            System.out.println("操作受限！");
        }
    }
}

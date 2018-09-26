package com.wanshare.oop.state;

/**
 * @ClassName Account
 * @Description: 账户
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 16:08
 */
public class Account {

    private AccountState state;//账户状态的抽象对象
    private String name;//账户名称
    private double balance = 0; //账户余额

    public Account(String name, double balance) {
        this.state = new NormalState(this);//设置初始状态
        this.name = name;
        this.balance = balance;

        System.out.println(this.name + "开户，初始金额为" + balance);
        System.out.println("---------------------------------------------");
    }

    public void deposit(double amount){
        System.out.println(this.name + ",存款" + amount);
        state.deposit(amount); //调用状态对象的deposit()方法
        System.out.println("现在余额为"+ this.balance);
        System.out.println("现在帐户状态为"+ this.state.getClass().getName());
        System.out.println("---------------------------------------------");
    }

    public void withdraw(double amount){
        System.out.println(this.name + ",取款" + amount);
        state.withdraw(amount); //调用状态对象的deposit()方法
        System.out.println("现在余额为"+ this.balance);
        System.out.println("现在帐户状态为"+ this.state.getClass().getName());
        System.out.println("---------------------------------------------");
    }

    public void computeInterest()
    {
        state.computeInterest(); //调用状态对象的computeInterest()方法
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountState setState(AccountState state) {
        return this.state = state;
    }
}

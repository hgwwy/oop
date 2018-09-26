package com.wanshare.oop.template;

/**
 * @ClassName Account
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 17:36
 */
public abstract class Account {

    //基本方法——抽象方法
    public abstract void calculateInterest();

    //统一的验证方法
    public boolean validate(String name, String pwd) {
        System.out.println("用户名：" + name);
        System.out.println("密码：" + pwd);
        if (name.equalsIgnoreCase("admin") && pwd.equalsIgnoreCase("123")) {
            return true;
        }
        return false;
    }

    public void display() {
        System.out.println("显示利息！");
    }

    //模板方法
    public void Handle(String account, String password) {
        if (!validate(account, password)) {
            System.out.println("账户或密码错误！");
            return;
        }
        calculateInterest();
        display();
    }
}


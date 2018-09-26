package com.wanshare.oop.command.instance;

import java.io.Serializable;

/**
 * @ClassName Command
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 11:38
 */
public abstract class Command implements Serializable {

    protected String name;
    protected String args;
    protected ConfigOperator operator;

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConfigOperator(ConfigOperator operator) {
        this.operator = operator;
    }

    //声明两个抽象的执行方法execute()
    public abstract void execute(String args);
    public abstract void execute();

}

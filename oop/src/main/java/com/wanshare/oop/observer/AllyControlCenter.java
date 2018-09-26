package com.wanshare.oop.observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @ClassName AllyControlCenter
 * @Description: 战队控制中心类：目标类
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 15:14
 */
public abstract class AllyControlCenter {
    protected String allyName; //战队名称
    protected List<Observer> players = Lists.newArrayList(); //战队成员

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public void join(Observer observer){
        System.out.println(observer.getName() + "加入" + this.allyName + "战队！");
        players.add(observer);
    }

    public void quit(Observer observer){
        System.out.println(observer.getName() + "离开" + this.allyName + "战队！");
        players.remove(observer);
    }

    public abstract void notifyObserver(String name);
}

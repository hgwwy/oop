package com.wanshare.oop.observer;

/**
 * @ClassName ConcreteAllyControlCenter
 * @Description: 具体战队控制中心类：具体目标类
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 15:14
 */
public class ConcreteAllyControlCenter extends AllyControlCenter{

    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！");
        System.out.println("----------------------------");
        this.allyName = allyName;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");
        for (Observer observer : players){
            //除去自己
            if (observer.getName().equalsIgnoreCase(name)) {
                continue;
            }
            observer.help();
        }

    }
}

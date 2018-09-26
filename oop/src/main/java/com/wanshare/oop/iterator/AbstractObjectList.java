package com.wanshare.oop.iterator;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @ClassName AbstractObjectList
 * @Description: 抽象聚合类
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 14:33
 */
public abstract class AbstractObjectList {

    protected List objectList = Lists.newArrayList();

    public AbstractObjectList(List objectList) {
        this.objectList = objectList;
    }

    public void addObject(Object obj){
        this.objectList.add(obj);
    }

    public void removeObject(Object obj){
        this.objectList.add(obj);
    }

    public List getObjects(){
        return this.objectList;
    }

    public abstract AbstractIterator createIterator();
}

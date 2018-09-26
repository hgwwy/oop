package com.wanshare.oop.iterator;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @ClassName Client
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 14:46
 */
public class Client {

    public static void main(String[] args) {
        List list = Lists.newArrayList();
        list.add("倚天剑");
        list.add("屠龙刀");
        list.add("断肠草");
        list.add("葵花宝典");
        list.add("四十二章经");

        AbstractObjectList objectList = new ProductList(list);
        AbstractIterator objIterator = objectList.createIterator();

        System.out.println("正向遍历-------");
        while (!objIterator.isLast()) {
            System.out.println(objIterator.getNextItem() + ",");
            objIterator.next();
        }
        System.out.println();
        System.out.println("逆向遍历---------");
        while (!objIterator.isFirst()) {
            System.out.println(objIterator.getPreviousItem() + ",");
            objIterator.previous();
        }

    }

}

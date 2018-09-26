package com.wanshare.oop.iterator;

import java.util.List;

/**
 * @ClassName ProductList
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 14:37
 */
public class ProductList extends AbstractObjectList{

    public ProductList(List objectList) {
        super(objectList);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}

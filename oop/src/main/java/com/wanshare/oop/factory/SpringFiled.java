package com.wanshare.oop.factory;

/**
 * @ClassName SpringFiled
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-13 11:41
 */
public class SpringFiled implements TextField{
    @Override
    public void display() {
        System.out.println("显示绿色边框文本框。");
    }
}

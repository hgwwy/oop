package com.wanshare.oop.decorator;

/**
 * @ClassName ScrollBarDecorator
 * @Description: 滚动条装饰类：具体装饰类
 * @Auther: WenYang Wang
 * @Date: 2018-9-15 11:32
 */
public class ScrollBarDecorator extends ComponentDecorator{

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void display()
    {
        this.setScrollBar();
        super.display();
    }

    public  void setScrollBar()
    {
        System.out.println("为构件增加滚动条！");
    }
}

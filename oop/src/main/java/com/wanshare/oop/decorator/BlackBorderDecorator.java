package com.wanshare.oop.decorator;

/**
 * @ClassName BlackBorderDecorator
 * @Description: 黑色边框装饰类：具体装饰类
 * @Auther: WenYang Wang
 * @Date: 2018-9-15 11:32
 */
public class BlackBorderDecorator extends  ComponentDecorator
{
       public BlackBorderDecorator(Component  component)
       {
              super(component);
       }

       public void display()
       {
              this.setBlackBorder();
              super.display();
       }

       public  void setBlackBorder()
       {
              System.out.println("为构件增加黑色边框！");
       }
}
package com.wanshare.oop.decorator;

/**
 * @ClassName TextBox
 * @Description: 文本框类：具体构件类
 * @Auther: WenYang Wang
 * @Date: 2018-9-15 11:28
 */
public class TextBox extends Component{
    @Override
    public void display() {
        System.out.println("显示文本框！");
    }
}

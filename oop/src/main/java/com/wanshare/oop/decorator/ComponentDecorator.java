package com.wanshare.oop.decorator;

/**
 * @ClassName ComponentDecorator
 * @Description: 构件装饰类：抽象装饰类
 * @Auther: WenYang Wang
 * @Date: 2018-9-15 11:30
 */
public class ComponentDecorator extends Component {

    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        this.component.display();
    }
}

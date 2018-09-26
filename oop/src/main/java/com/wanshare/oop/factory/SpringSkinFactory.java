package com.wanshare.oop.factory;

/**
 * @ClassName SpringSkinFactory
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-13 11:44
 */
public class SpringSkinFactory implements SkinFactory{
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringFiled();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}

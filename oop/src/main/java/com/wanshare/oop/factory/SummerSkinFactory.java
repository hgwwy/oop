package com.wanshare.oop.factory;

/**
 * @ClassName SummerSkinFactory
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-13 11:45
 */
public class SummerSkinFactory implements SkinFactory{
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}

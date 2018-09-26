package com.wanshare.oop.command;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @ClassName FBSettingWindow
 * @Description: 功能键设置窗口类
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 11:02
 */
public class FBSettingWindow {

    private String title;
    private List<FunctionButton> list = Lists.newArrayList();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton button){
        list.add(button);
    }

    public void removeFunctionButton(FunctionButton button){
        list.remove(button);
    }

    //显示窗口及功能键
    public void display() {
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        for (Object obj : list) {
            System.out.println(((FunctionButton)obj).getName());
        }
        System.out.println("------------------------------");
    }
}

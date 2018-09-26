package com.wanshare.oop.command;

/**
 * @ClassName Client
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 11:14
 */
public class Client {
    public static void main(String[] args) {
        FBSettingWindow settingWindow = new FBSettingWindow("功能键设置");

        FunctionButton fb1,fb2;
        fb1 = new FunctionButton("最小化");
        fb2 = new FunctionButton("显示帮助");

        Command cmd1,cmd2;
        cmd1 = new MinimizeCommand(null);
        cmd2 = new HelpCommand(null);
        //将命令对象注入功能键
        fb1.setCommand(cmd1);
        fb2.setCommand(cmd2);
        //将功能键注入到窗体
        settingWindow.addFunctionButton(fb1);
        settingWindow.addFunctionButton(fb2);
        settingWindow.display();
        //调用具体功能键
        fb1.onClick();
        fb2.onClick();
    }
}

package com.wanshare.oop.command.instance;

/**
 * @ClassName Client
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 11:53
 */
public class Client {

    public static void main(String[] args) {
        ConfigSettingWindow settingWindow = new ConfigSettingWindow(); //定义请求发送者
        Command command; //定义命令对象
        ConfigOperator operator = new ConfigOperator(); //定义请求接收者

        //四次对配置文件的更改
        command = new InsertCommand("增加");
        command.setConfigOperator(operator);
        settingWindow.setCommand(command);
        settingWindow.call("首页大广告");

        command = new InsertCommand("增加");
        command.setConfigOperator(operator);
        settingWindow.setCommand(command);
        settingWindow.call("首页导航");

        command = new DeleteCommand("删除");
        command.setConfigOperator(operator);
        settingWindow.setCommand(command);
        settingWindow.call("首页导航");

        command = new DeleteCommand("删除");
        command.setConfigOperator(operator);
        settingWindow.setCommand(command);
        settingWindow.call("大广告");

        System.out.println("----------------------------");
        System.out.println("保存配置");
        settingWindow.save();

        System.out.println("----------------------------");
        System.out.println("恢复配置");
        System.out.println("----------------------------");
        settingWindow.recover();

    }
}

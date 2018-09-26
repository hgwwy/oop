package com.wanshare.oop.command;

/**
 * @ClassName HelpCommand
 * @Description: 打开帮助命令类：具体命令类
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 11:11
 */
public class HelpCommand extends Command{
    private HelpHandler handler;

    public HelpCommand(HelpHandler handler) {
        this.handler = new HelpHandler();
    }

    @Override
    public void execute() {
        this.handler.display();
    }
}

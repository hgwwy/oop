package com.wanshare.oop.command;

/**
 * @ClassName MinimizeCommand
 * @Description: 最小化命令类：具体命令类
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 11:12
 */
public class MinimizeCommand extends Command{
    private WindowHanlder hanlder;

    public MinimizeCommand(WindowHanlder hanlder) {
        this.hanlder = new WindowHanlder();
    }

    @Override
    public void execute() {
        this.hanlder.minimize();
    }
}

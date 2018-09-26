package com.wanshare.oop.command.queue;

import com.google.common.collect.Lists;
import com.wanshare.oop.command.Command;

import java.util.List;

/**
 * @ClassName CommandQueue
 * @Description: 命令队列存储多个命令对象，而不同的命令对象可以对应不同的请求接收者
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 11:21
 */
public class CommandQueue {

    private List<Command> commandList = Lists.newArrayList();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void removeCommand(Command command) {
        commandList.remove(command);
    }

    //循环调用每一个命令对象的execute()方法
    public void execute() {
        for (Object command : commandList) {
            ((Command)command).execute();
        }
    }

}

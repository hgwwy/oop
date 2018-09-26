package com.wanshare.oop.command.queue;

import com.wanshare.oop.command.HelpCommand;
import com.wanshare.oop.command.MinimizeCommand;

/**
 * @ClassName Client
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 11:27
 */
public class Client {

    public static void main(String[] args) {
        CommandQueue queue = new CommandQueue();
        queue.addCommand(new HelpCommand(null));
        queue.addCommand(new MinimizeCommand(null));

        Invoker invoker = new Invoker(queue);
        invoker.call();
    }
}

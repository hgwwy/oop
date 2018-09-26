package com.wanshare.oop.command.queue;

/**
 * @ClassName Invoker
 * @Description: 请求发送者
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 11:26
 */
public class Invoker {

    private CommandQueue queue;

    public Invoker(CommandQueue queue) {
        this.queue = queue;
    }

    public void call(){
        queue.execute();
    }
}

package com.wanshare.oop.command.instance;

/**
 * @ClassName DeleteCommand
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 11:43
 */
public class DeleteCommand extends Command{

    public DeleteCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        operator.delete(args);
    }

    @Override
    public void execute() {
        operator.delete(args);
    }
}

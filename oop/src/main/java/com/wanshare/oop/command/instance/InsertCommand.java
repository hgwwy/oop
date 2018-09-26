package com.wanshare.oop.command.instance;

/**
 * @ClassName InsertCommand
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 11:41
 */
public class InsertCommand extends Command{

    public InsertCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        operator.insert(args);
    }

    @Override
    public void execute() {
        operator.insert(this.args);
    }
}

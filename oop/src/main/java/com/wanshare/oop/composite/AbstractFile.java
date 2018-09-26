package com.wanshare.oop.composite;

/**
 * @ClassName AbstractFile
 * @Description: 抽象构件类
 * @Auther: WenYang Wang
 * @Date: 2018-9-15 10:14
 */
public abstract class AbstractFile {

    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int i);
    public abstract void killvirus();

}

package com.wanshare.oop.composite;

/**
 * @ClassName TextFile
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-15 10:21
 */
public class TextFile extends AbstractFile{

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    @Override
    public AbstractFile getChild(int i) {
        return null;
    }

    @Override
    public void killvirus() {
        System.out.println("----对文本文件'" + name + "'进行杀毒");
    }
}

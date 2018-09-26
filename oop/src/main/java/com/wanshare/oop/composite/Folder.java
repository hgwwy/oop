package com.wanshare.oop.composite;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @ClassName Folder
 * @Description: 文件夹类：容器构件
 * @Auther: WenYang Wang
 * @Date: 2018-9-15 10:17
 */
public class Folder extends AbstractFile{

    private String name;
    private List<AbstractFile> list = Lists.newArrayList();

    public Folder(String name){
        this.name = name;
    }


    @Override
    public void add(AbstractFile file) {
        this.list.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        this.list.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return list.get(i);
    }

    @Override
    public void killvirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");  //模拟杀毒
        //递归调用成员构件的killVirus()方法
        for(Object obj : list) {
            ((AbstractFile)obj).killvirus();
        }
    }
}

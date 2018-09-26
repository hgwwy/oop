package com.wanshare.oop.composite;

//图像文件类：叶子构件
class ImageFile extends AbstractFile {
    private String name;  

    public ImageFile(String name) {  
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
        System.out.println("----对图像文件'" + name + "'进行杀毒");
    }
}
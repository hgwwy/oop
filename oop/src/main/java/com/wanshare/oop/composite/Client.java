package com.wanshare.oop.composite;

class Client {
    public static void main(String args[]) {  
        //针对抽象构件编程  
        AbstractFile file1,file2,file3,file4,folder1,folder2,folder3;

        folder1 = new Folder("Sunny的资料");  
        folder2 = new Folder("图像文件");  
        folder3 = new Folder("文本文件");  

        file1 = new ImageFile("小龙女.jpg");  
        file2 = new ImageFile("张无忌.gif");  
        file3 = new TextFile("九阴真经.txt");  
        file4 = new TextFile("葵花宝典.doc");  

        folder2.add(file1);  
        folder2.add(file2);  
        folder3.add(file3);  
        folder3.add(file4);  
        folder1.add(folder2);
        folder1.add(folder3);  

        //从“Sunny的资料”节点开始进行杀毒操作  
        folder1.killvirus();
    }  
}
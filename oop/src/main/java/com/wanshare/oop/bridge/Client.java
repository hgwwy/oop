package com.wanshare.oop.bridge;

class Client {
    public static void main(String args[]) {  
        Image image;  
        ImageImp imp;  
        image = new GIFImage();
        imp = new LinuxImp();
        image.setImageImp(imp);  
        image.parseFile("小龙女");  
    }  
}
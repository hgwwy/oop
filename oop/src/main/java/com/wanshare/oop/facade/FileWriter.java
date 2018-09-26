package com.wanshare.oop.facade;

/**
 * @ClassName FileWriter
 * @Description: 文件保存类，充当子系统类
 * @Auther: WenYang Wang
 * @Date: 2018-9-15 11:47
 */
public class FileWriter {

    public String write(String text) {
        return "保存加密内容:"+text;
    }

}

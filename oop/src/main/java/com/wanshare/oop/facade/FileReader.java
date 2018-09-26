package com.wanshare.oop.facade;

/**
 * @ClassName FileReader
 * @Description: 文件读取类，充当子系统类
 * @Auther: WenYang Wang
 * @Date: 2018-9-15 11:46
 */
public class FileReader {

    public String read(String fileNameSrc) {
        return "读取"+fileNameSrc+"中的内容!";
    }

}

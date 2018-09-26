package com.wanshare.oop.facade;

/**
 * @ClassName CipherMachine
 * @Description: 数据加密类，充当子系统类
 * @Auther: WenYang Wang
 * @Date: 2018-9-15 11:46
 */
public class CipherMachine {

    public String cipher(String text) {
        return "加密:"+text;
    }

}

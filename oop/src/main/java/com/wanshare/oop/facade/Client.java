package com.wanshare.oop.facade;

/**
 * @ClassName Client
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-15 11:54
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(new EncryptFacade().save("D"));
    }

}

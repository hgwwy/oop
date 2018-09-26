package com.wanshare.oop.proxy;

/**
 * @ClassName AccessValidator
 * @Description: 身份验证类，业务类，它提供方法Validate()来实现身份验证
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 09:30
 */
public class AccessValidator {

    //模拟实现登录验证
    public boolean validate(String userName) {
        if (userName.equals("admin")) {
            System.out.println("登录成功");
            return true;
        }
        System.out.println("登录失败");
        return false;
    }

}

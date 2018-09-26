package com.wanshare.oop.builder;

/**
 * @ClassName MainTest
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-14 14:42
 */
public class MainTest {

    public static void main(String[] args) {
        Actor actor = new HeroBuilder().construct();
        System.out.println(actor.toString());
    }


}

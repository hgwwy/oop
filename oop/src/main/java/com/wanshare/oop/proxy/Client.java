package com.wanshare.oop.proxy;

/**
 * @ClassName Client
 * @Description:
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 10:22
 */
public class Client {
    public static void main(String[] args) {
        Searcher searcher = new ProxySearcher();
        System.out.println(searcher.DoSearch("admin", "haha"));
    }
}

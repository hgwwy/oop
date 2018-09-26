package com.wanshare.oop.proxy;

/**
 * @ClassName RealSearcher
 * @Description: 具体查询类，充当真实主题角色，它实现查询功能，提供方法DoSearch()来查询信息
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 10:08
 */
public class RealSearcher implements Searcher{
    @Override
    public String DoSearch(String userName, String keyword) {
        String str = "用户%s使用关键词%s查询出的信息";
        str = String.format(str, userName, keyword);
        return str;
    }
}

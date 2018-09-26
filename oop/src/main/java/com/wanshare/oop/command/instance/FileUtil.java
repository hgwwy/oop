package com.wanshare.oop.command.instance;

import com.google.common.collect.Lists;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//工具类：文件操作类
class FileUtil {

    private static List commandHistoryList = Lists.newArrayList();

    //将命令集合写入日志文件  
    public static void writeCommands(List commands) {
        commandHistoryList.add(commands);
    }

    //从日志文件中提取命令集合  
    public static ArrayList readCommands() {
        //将文件中的对象读出并转换为ArrayList类型
        ArrayList commands = (ArrayList) commandHistoryList.get(0);
        return commands;
    }
}
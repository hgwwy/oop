package com.wanshare.oop.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @ClassName PropertiesUtil
 * @Description: 获取*.properties中的属性值
 * @Auther: WenYang Wang
 * @Date: 2018/8/27 16:47
 */
public class PropertiesUtil {

    private static Properties props;
    private String fileName = "";

    private PropertiesUtil() {
        fileName = "env.properties";
        loadProps(fileName);
    }

    public PropertiesUtil(String fileName) {
        if (fileName == null || fileName.equals("")) {
            fileName = "env.properties";
        }
        loadProps(fileName);
    }

    private static class InnerClass {
        private final static PropertiesUtil instance = new PropertiesUtil();
    }

    public static PropertiesUtil getInstance() {
        return InnerClass.instance;
    }


    synchronized private void loadProps(String fileName) {

        props = new Properties();
        InputStream in = null;
        try {
            in = PropertiesUtil.class.getClassLoader().getResourceAsStream(fileName);
            props.load(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != in) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String getProperty(String key) {
        if (null == props) {
            loadProps("");
        }
        return props.getProperty(key);
    }

    public String getProperty(String key, String defaultValue) {
        if (null == props) {
            loadProps("");
        }
        return props.getProperty(key, defaultValue);
    }
}
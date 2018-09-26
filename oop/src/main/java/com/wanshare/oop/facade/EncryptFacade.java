package com.wanshare.oop.facade;

/**
 * @ClassName EncryptFacade
 * @Description: 外观类
 * @Auther: WenYang Wang
 * @Date: 2018-9-15 11:44
 */
public class EncryptFacade {

    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;

    public EncryptFacade() {
        this.reader = new FileReader();
        this.cipher = new CipherMachine();
        this.writer = new FileWriter();
    }

    public String save(String path){
        String text = this.reader.read(path);
        String encode = this.cipher.cipher(text);
        return this.writer.write(encode);
    }
}

package com.tg.IODemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Description: BufferedInputStream
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/13
 * @Version: 1.0
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("0405/src/com/tg/IODemo/mistake.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0,  len));
        }
        bis.close();
    }
}

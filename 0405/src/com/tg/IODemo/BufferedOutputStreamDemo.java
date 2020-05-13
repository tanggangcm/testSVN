package com.tg.IODemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description: BufferedOutputStreamDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/13
 * @Version: 1.0
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("0405/src/com/tg/IODemo/mistake.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("asdfba".getBytes());
        bos.flush();
        bos.close();
    }
}

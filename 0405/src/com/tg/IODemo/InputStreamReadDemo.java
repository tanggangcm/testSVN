package com.tg.IODemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description: InputStreamReadDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/16
 * @Version: 1.0
 */
public class InputStreamReadDemo {
    public static void main(String[] args) throws IOException {
        read_utf_8();
    }

    private static void read_utf_8() throws IOException {
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("0405/src/com/tg/IODemo/e.txt"),
//                "utf-8");
                "GBK");
        char[] chars = new char[1024];
        int len = 0;
        while((len = isr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }

        isr.close();
    }
}

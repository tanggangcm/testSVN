package com.tg.IODemo;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Description: InputStreamDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/11
 * @Version: 1.0
 */
public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        readDemo02();
    }

    private static void readDemo02() throws IOException {
        FileInputStream fis = new FileInputStream("0405/src/com/tg/IODemo/mistake.txt");
//        byte[] bytes = new byte[2];
//        int read = fis.read(bytes);
//        System.out.println(read);
//        System.out.println(new String(bytes));

        byte[] bytes = new byte[1024];
        int read = 0;
        while((read = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, read));
        }
        fis.close();
    }

    private static void readDemo() throws IOException {
        FileInputStream fis = new FileInputStream("0405/src/com/tg/IODemo/mistake.txt");
        int len = 0;
        while((len = fis.read()) != -1) {
            System.out.print((char)len);
        }

        fis.close();
    }
}

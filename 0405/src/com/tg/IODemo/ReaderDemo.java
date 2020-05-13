package com.tg.IODemo;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Description: ReaderDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/12
 * @Version: 1.0
 */
public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        readDemo02();
    }

    private static void readDemo02() throws IOException {
        FileReader fr = new FileReader("0405/src/com/tg/IODemo/c.txt");
        char[] chars = new char[1024];
        int len = 0;
        while ((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }

        fr.close();
    }

    private static void readDemo01() throws IOException {
        FileReader fr = new FileReader("0405/src/com/tg/IODemo/c.txt");
        int len = 0;
        while((len = fr.read()) != -1) {
            System.out.print((char)len);
        }
        fr.close();
    }
}

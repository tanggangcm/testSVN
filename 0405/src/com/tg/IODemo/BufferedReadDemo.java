package com.tg.IODemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Description: BufferedReadDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/13
 * @Version: 1.0
 */
public class BufferedReadDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("0405/src/com/tg/IODemo/mistake.txt"));
        String str = "";
        while((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }
}

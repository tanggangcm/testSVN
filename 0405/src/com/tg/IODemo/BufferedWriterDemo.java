package com.tg.IODemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description: BufferedWriter
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/13
 * @Version: 1.0
 */
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("0405/src/com/tg/IODemo/mistake.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("最繁华的撒娇看风很大数据库反对");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

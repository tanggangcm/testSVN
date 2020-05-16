package com.tg.IODemo;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @Description: PrintStreamDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/16
 * @Version: 1.0
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("0405/src/com/tg/IODemo/print.txt");
        ps.write(97);
        ps.println(97);
        ps.close();
    }
}

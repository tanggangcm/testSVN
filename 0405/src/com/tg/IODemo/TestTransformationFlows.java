package com.tg.IODemo;

import java.io.*;

/**
 * @Description: TestTransformationFlows
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/16
 * @Version: 1.0
 */
public class TestTransformationFlows {
    public static void main(String[] args) throws IOException {
        InputStreamReader gbk = new InputStreamReader(
                new FileInputStream("0405/src/com/tg/IODemo/e.txt"),
                "GBK");

        OutputStreamWriter utf8 = new OutputStreamWriter(
                new FileOutputStream("0405/src/com/tg/IODemo/f.txt"),
                "utf-8");

        char[] chars = new char[1024];
        int len = 0;
        while((len = gbk.read(chars)) != -1) {
            utf8.write(new String(chars, 0, len));
        }

        utf8.close();
        gbk.close();
    }
}

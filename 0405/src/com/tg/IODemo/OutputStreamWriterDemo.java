package com.tg.IODemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Description: OutputStreamWriter
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/16
 * @Version: 1.0
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        writer_utf_8();
    }

    private static void writer_utf_8() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("0405/src/com/tg/IODemo/e.txt"),
//                "utf-8");
                "GBK");
        osw.write("这是一个转换流");
        osw.flush();
        osw.close();
    }
}

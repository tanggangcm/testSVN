package com.tg.IODemo;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description: OutputStreamDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/11
 * @Version: 1.0
 */
public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        fileOutputStream();
//        fileOutputStream01();
    }

    private static void fileOutputStream01() throws IOException {
        FileOutputStream fos = new FileOutputStream("0405\\src\\com\\tg\\IODemo\\b.txt");
        fos.write(49);
        fos.write(48);
        fos.write(48);

        byte[] bytes = {69, 68, 68};
        fos.write(bytes);

        byte[] bytes1 = "你好".getBytes();
        fos.write(bytes1);

        fos.write(bytes,1,2);

        fos.close();
    }

    private static void fileOutputStream() throws IOException {
        FileOutputStream fos = new FileOutputStream("0405\\src\\com\\tg\\IODemo\\mistake.txt", true);
        fos.write(97);
        fos.close();
    }
}

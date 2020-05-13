package com.tg.IODemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description: CopyFile
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/12
 * @Version: 1.0
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Program Files (x86)\\Tencent\\QQ\\document\\619761986\\FileRecv\\MobileFile\\IMG_20200318_102914.jpg");
        FileOutputStream fos = new FileOutputStream("0405/src/com/tg/IODemo/a.jpg");

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        fos.close();
        fis.close();
    }
}

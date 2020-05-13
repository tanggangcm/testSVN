package com.tg.IODemo;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description: WriteDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/12
 * @Version: 1.0
 */
public class WriterDemo {
    public static void main(String[] args) throws IOException {
//     writerDemo02();
//        trycatchDemo();
        trycatchDemoJDK7();
//        trycatchDemoJDK9();
    }

    /*private static void trycatchDemoJDK9() throws IOException {
        FileWriter fw = new FileWriter("0405/src/com/tg/IODemo/d.txt");
        try(fw) {
            for (int i = 0; i < 10; i++) {
                fw.write("hello" + i + "\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReader fr = new FileReader("0405/src/com/tg/IODemo/d.txt");
        try(fr; fw) {
            char[] chars = new char[1024];
            int len  =0;
            while((len = fr.read(chars)) != -1) {
                System.out.println(new String(chars, 0, len));
            }

            for (int i = 0; i < 10; i++) {
                fw.write("fdasfdas" + i + "\r\n");
            }
        }
    }*/

    private static void trycatchDemoJDK7() {
        try(FileWriter fw = new FileWriter("0405/src/com/tg/IODemo/d.txt")) {
            for (int i = 0; i < 10; i++) {
                fw.write("hello" + i + "\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void trycatchDemo() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("0405/src/com/tg/IODemo/d.txt", true);
            for (int i = 0; i < 10; i++) {
                fw.write("hello" + i + "\r\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void writerDemo02() throws IOException {
        FileWriter fw = new FileWriter("0405/src/com/tg/IODemo/d.txt");
        fw.write("gfdsgjfdsklg 风很大数据库");
        fw.close();
    }

    private static void writerDemo() throws IOException {
        FileWriter fw = new FileWriter("0405/src/com/tg/IODemo/d.txt");
        fw.write(97);;
        fw.flush();
        fw.close();
    }
}

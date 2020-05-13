package com.tg.fileDemo;

import java.io.File;

/**
 * @Description: OutputStreamDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/11
 * @Version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
//        fileDemo01();
//        show01();
//        show02("D:", "d.txt");
//        show03(new File("D:"), "d.txt");
//        show04();
        File file = new File("0405/src/com/tg");
        show05(file);
    }

    private static void show05(File file) {
//        File[] files = file.listFiles(f -> f.isDirectory() || f.getName().toLowerCase().endsWith(".java"));
        File[] files = file.listFiles((d, f) -> new File(d, f).isDirectory() || f.toLowerCase().endsWith(".java"));
        for (File fileName : files) {
            if (fileName.isDirectory()) {
                show05(fileName);
            } else {
                System.out.println(fileName.getPath());
            }
        }

    }

    private static void show04() {
        File file1 = new File("D:\\project\\2020java\\0405\\src\\com\\tg\\fileDemo\\OutputStreamDemo.java");
        System.out.println("file1-->" + file1.length());



        File file = new File("D:\\project\\2020java\\OutputStreamDemo.java");
        String absolutePath = file.getAbsolutePath();
        String path = file.getPath();
        System.out.println(absolutePath);
        System.out.println("---------------");
        System.out.println(path);
        System.out.println("---------------");
        System.out.println(file.length());
        System.out.println("---------------");
        System.out.println(file.getName());
        System.out.println("---------------");

        File file2 = new File("OutputStreamDemo.java");
        String absolutePath1 = file2.getAbsolutePath();
        String path1 = file2.getPath();
        System.out.println(absolutePath1);
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(path1);
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(file2.length());
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(file2.getName());
        System.out.println("+++++++++++++++++++++++++");
    }

    private static void show03(File parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    private static void show02(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    private static void show01() {
        File file = new File("D:\\project\\2020java\\0405\\src\\com\\tg\\fileDemo\\OutputStreamDemo.java");
        System.out.println(file);

        File file1 = new File("D:\\project\\2020java\\0405\\src\\com\\tg\\fileDemo");
        System.out.println(file1);

        File file2 = new File("OutputStreamDemo.java");
        System.out.println(file2);
    }

    private static void fileDemo01() {
        String pathSeparator = File.pathSeparator;//路径分隔符 windows ; linux :
        System.out.println(pathSeparator);

        String separator = File.separator; //文件名称分隔符 windows \ linux /
        System.out.println(separator);


    }
}

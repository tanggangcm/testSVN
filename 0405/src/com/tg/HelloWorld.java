package com.tg;

import java.util.ArrayList;

/**
 * @Description: HelloWorld
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/5
 * @Version: 1.0
 */
public class HelloWorld {
    public static void main(String[] args) {

        byte[] bytes = "abc".getBytes();
        System.out.println(bytes);

        String str = new String("zheshi yige srtirng");

        System.out.println(str);

        ArrayList<String> list = new ArrayList<>();
        list.add("则是");
        list.add("这不是");
        System.out.println(list);

        Student student = new Student();
        student.setMale(true);

        System.out.println(student.getMale());

        char[] c = new char[1];
        System.out.println(c[0]);
        int[] a;
//        a = {1, 2};报错
        int[] i = {12, 23, 32};
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }
        int b = i.length;
        System.out.println(i);
    }
    public static int method1() {
        return 'A';
    }
    public static int getSum(int a, int b) {
        return a + b;
    }
    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }
}

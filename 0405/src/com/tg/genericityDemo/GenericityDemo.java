package com.tg.genericityDemo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.SimpleFormatter;

/**
 * @Description: GenericityDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/22
 * @Version: 1.0
 */
public class GenericityDemo {
    public static void main(String[] args) {
//        show1();
//        show2();
        long one = 1587538132000L;
        long two = 1591949285000L;
        Date date1 = new Date(one);
        Date date2 = new Date(two);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String format1 = simpleDateFormat.format(date1);
        String format2 = simpleDateFormat.format(date2);
        System.out.println(format1);
        System.out.println(format2);
    }

    private static void show2() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("张三");
        strings.add("李四");

        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next().length());
        }

        System.out.println("--------------------");
        for(String s : strings) {
            System.out.println(s);
        }
    }

    private static void show1() {
        ArrayList objects = new ArrayList();
        objects.add("abc");
        objects.add(1);

        Iterator iterator = objects.iterator();
        while(iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}

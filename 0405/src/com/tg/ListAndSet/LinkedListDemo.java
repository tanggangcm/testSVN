package com.tg.ListAndSet;

import java.util.LinkedList;

/**
 * @Description: LinkedListDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/28
 * @Version: 1.0
 */
public class LinkedListDemo {
    public static void main(String[] args) {
//        show01();
//        show02();
        show03();
    }

    private static void show03() {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");

        System.out.println(strings);
        String s = strings.removeFirst();
        System.out.println(s);
        System.out.println(strings);

        System.out.println(strings.removeLast());
        System.out.println(strings);

        System.out.println(strings.pop());
        System.out.println(strings);
    }

    private static void show02() {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        System.out.println(strings);
        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());

        strings.clear();
        System.out.println(strings);

        if(strings.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void show01() {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        System.out.println(strings);

        strings.addFirst("www");
        System.out.println(strings);

        strings.push("asd");
        System.out.println(strings);

        strings.addLast("com");
        System.out.println(strings);
    }
}

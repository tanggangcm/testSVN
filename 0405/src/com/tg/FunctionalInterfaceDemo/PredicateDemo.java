package com.tg.FunctionalInterfaceDemo;

import java.util.function.Predicate;

/**
 * @Description: PredicateDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class PredicateDemo {
    public static void main(String[] args) {
        String str = "ngjk";
        boolean b = checkString(str, s -> s.length() > 5);
        System.out.println(b);
    }

    private static boolean checkString(String name, Predicate<String> predicate) {
        return predicate.test(name);
    }
}

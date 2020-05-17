package com.tg.FunctionalInterfaceDemo;

import java.util.function.Function;

/**
 * @Description: FunctionDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class FunctionDemo {
    public static void main(String[] args) {
        String s = "123";
        change(s, s1 -> Integer.parseInt(s1));
    }

    private static void change(String s, Function<String, Integer> function) {
        System.out.println(function.apply(s));
    }
}

package com.tg.FunctionalInterfaceDemo;

import java.util.function.Function;

/**
 * @Description: FunctionAndThenDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class FunctionAndThenDemo {
    public static void main(String[] args) {
        String str = "12";

        change(str, f -> Integer.parseInt(f) + 10, f -> String.valueOf(f));
    }
    private static void change(String str, Function<String, Integer> fun1,
                               Function<Integer, String> fun2) {
        System.out.println(fun1.andThen(fun2).apply(str));
    }
}

package com.tg.FunctionalInterfaceDemo;

import java.util.function.Function;

/**
 * @Description: FunctionAndThenDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class FunctionAndThenTest {
    public static void main(String[] args) {
        String str = "赵丽颖，20";

        change(str, f -> f.split("，")[1],
                f -> Integer.parseInt(f),
                f -> f + 100);
    }
    private static void change(String str, Function<String, String> fun1,
                               Function<String, Integer> fun2,
                               Function<Integer, Integer> fun3) {
        Integer apply = fun1.andThen(fun2).andThen(fun3).apply(str);
        System.out.println(apply);
    }
}

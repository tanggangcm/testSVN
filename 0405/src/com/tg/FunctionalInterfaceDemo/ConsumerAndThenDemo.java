package com.tg.FunctionalInterfaceDemo;

import java.util.function.Consumer;

/**
 * @Description: ConsumerDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class ConsumerAndThenDemo {
    public static void main(String[] args) {
        method("Hello", t -> System.out.println(t.toUpperCase()), t -> System.out.println(t.toLowerCase()));
    }
    private static void method(String name, Consumer<String> consumer1, Consumer<String> consumer2) {
//        consumer1.accept(name);
//        consumer2.accept(name);
        consumer1.andThen(consumer2).accept(name);
    }
}

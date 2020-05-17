package com.tg.FunctionalInterfaceDemo;

import java.util.function.Consumer;

/**
 * @Description: ConsumerDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        method("赵丽颖", name -> System.out.println(new StringBuilder(name).reverse().toString()));
    }
    private static void method(String name, Consumer<String> consumer) {
        consumer.accept(name);
    }
}

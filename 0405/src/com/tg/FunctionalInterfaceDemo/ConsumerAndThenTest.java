package com.tg.FunctionalInterfaceDemo;

import java.util.function.Consumer;

/**
 * @Description: ConsumerDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class ConsumerAndThenTest {
    public static void main(String[] args) {
        String[] arr = {"古力娜扎，78", "迪丽热巴， 98", "马儿扎哈， 45"};

        printInfo(arr, message -> System.out.print("姓名：" + message.split("，")[0]),
                message ->System.out.println("。年龄：" + message.split("，")[1] + "。"));
    }
    private static void printInfo(String[] arr, Consumer<String> consumer1, Consumer<String> consumer2) {
        for (String s : arr) {
            consumer1.andThen(consumer2).accept(s);
        }
    }
}

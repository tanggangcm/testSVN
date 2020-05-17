package com.tg.FunctionalInterfaceDemo;

/**
 * @Description: LambdaDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class LambdaDemo {
    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";
        showLog(1, () -> msg1 + msg2 + msg3);
    }
    public static void showLog(int level, MessageBuilder mb) {
        if(level == 1) {
            System.out.println(mb.message());
        }
    }
}

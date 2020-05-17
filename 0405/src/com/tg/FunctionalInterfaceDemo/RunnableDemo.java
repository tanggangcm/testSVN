package com.tg.FunctionalInterfaceDemo;

/**
 * @Description: RunnableDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class RunnableDemo {
    public static void main(String[] args) {
        startThread(() -> System.out.println("hahah"));
    }

    private static void startThread(Runnable run) {
        new Thread(run).start();
    }
}

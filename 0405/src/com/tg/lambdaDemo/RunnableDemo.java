package com.tg.lambdaDemo;

/**
 * @Description: RunnableDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/10
 * @Version: 1.0
 */
public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

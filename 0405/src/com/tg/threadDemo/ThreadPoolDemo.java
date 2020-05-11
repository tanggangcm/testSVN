package com.tg.threadDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: ThreadPoolDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/10
 * @Version: 1.0
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(new RImpl());
        executorService.submit(new RImpl());
        executorService.submit(new RImpl());

        executorService.shutdown();
    }
}

package com.tg.threadDemo;

/**
 * @Description: MyThread
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/5
 * @Version: 1.0
 */
public class MyThread extends Thread {
    @Override
    public void run() {
//        for (int i = 0; i < 20; i++) {
//            System.out.println("myThread -->" + i);
//        }
        /*String name = getName();
        System.out.println(name);*/
        System.out.println(Thread.currentThread());
    }
}

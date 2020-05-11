package com.tg.threadDemo;

/**
 * @Description: WaitAndNotifyDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/6
 * @Version: 1.0
 */
public class WaitAndNotifyDemo {
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread(() -> {
            synchronized (obj) {
                System.out.println("进入无线等待状态");
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("唤醒之后执行的代码");
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj) {
                System.out.println("唤醒");
                obj.notify();
            }
        }).start();

    }
}

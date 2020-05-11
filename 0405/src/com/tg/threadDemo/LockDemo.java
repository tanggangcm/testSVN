package com.tg.threadDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: LockDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/6
 * @Version: 1.0
 */
public class LockDemo implements Runnable {
    private int ticket = 100;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            lock.lock();
            if(ticket > 0) {
                try {
                    Thread.sleep(1);
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        }
    }
}

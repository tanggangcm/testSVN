package com.tg.threadDemo;

/**
 * @Description: RImpl
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/10
 * @Version: 1.0
 */
public class RImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--> crate new Thread");
    }
}

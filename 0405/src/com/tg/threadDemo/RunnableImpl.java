package com.tg.threadDemo;

/**
 * @Description: RunnableImpl
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/6
 * @Version: 1.0
 */
public class RunnableImpl implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {
        while(true) {
            payTicket();
        }
    }

    public synchronized void payTicket() {
        if(ticket > 0) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
            ticket--;
        }
    }
}

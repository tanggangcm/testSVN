package com.tg.threadDemo;

/**
 * @Description: Baozipu
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/10
 * @Version: 1.0
 */
public class Baozipu extends Thread {
    private Baozi baozi;

    public Baozipu(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        int count = 0;
        while(true) {
            synchronized (baozi) {
                if (baozi.isFlag()) {
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (count % 2 == 0) {
                    baozi.setPi("薄皮");
                    baozi.setXian("三鲜");
                } else {
                    baozi.setPi("冰皮");
                    baozi.setXian("牛肉");
                }

                count++;
                System.out.println("包子铺正在生产：" + baozi.getPi() + baozi.getXian() + "包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                baozi.setFlag(true);
                baozi.notify();

                System.out.println("包子铺已经生产好了" + baozi.getPi() + baozi.getXian() + "包子，可以开始吃了");
            }
        }
    }
}

package com.tg.threadDemo;

/**
 * @Description: ChiHuo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/10
 * @Version: 1.0
 */
public class ChiHuo extends Thread {
    private Baozi baozi;

    public ChiHuo(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (baozi) {
                if(!baozi.isFlag()) {
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("吃货正在吃" + baozi.getPi() + baozi.getXian() + "包子");
                baozi.setFlag(false);

                baozi.notify();

                System.out.println("吃货已经把" + baozi.getPi() + baozi.getXian() + "包子吃完了, 包子铺开始生产包子");

                System.out.println("----------------------");
            }
        }
    }
}

package com.tg.threadDemo;

/**
 * @Description: BaoziDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/10
 * @Version: 1.0
 */
public class BaoziDemo {
    public static void main(String[] args) {
        Baozi baozi = new Baozi();

        Baozipu baozipu = new Baozipu(baozi);
        ChiHuo chiHuo = new ChiHuo(baozi);

        baozipu.start();
        chiHuo.start();
    }
}

package com.tg.streamDemo;

/**
 * @Description: Husband
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class Husband {
    public void buyHouse() {
        System.out.println("买房");
    }
    public void marry(Richable richable) {
        richable.buy();
    }

    public void soHappy() {
        marry(() -> this.buyHouse());
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}

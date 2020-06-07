package com.tg.proxy;

/**
 * @Description: Lenove
 * @Author: tanggang
 * @Date: 2020/6/6
 * @Version: 1.0
 */
public class Lenove implements SaleComputer {
    @Override
    public String sale(double money) {
        System.out.println("花了" + money + "yuan");
        return "Lenovo";
    }

    @Override
    public void show() {
        System.out.println("Lenovo....");
    }
}

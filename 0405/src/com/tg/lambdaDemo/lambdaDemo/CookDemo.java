package com.tg.lambdaDemo.lambdaDemo;

/**
 * @Description: CookDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/11
 * @Version: 1.0
 */
public class CookDemo {
    public static void main(String[] args) {
        invokeCook(() -> {
            System.out.println("吃饭了");
        });
    }
    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}

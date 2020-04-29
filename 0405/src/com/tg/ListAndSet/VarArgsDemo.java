package com.tg.ListAndSet;

/**
 * @Description: VarArgsDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/28
 * @Version: 1.0
 */
public class VarArgsDemo {
    public static void main(String[] args) {
        add(1, 2);
    }

    private static void add(int...a) {
        System.out.println(a);
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println(sum);
    }
}

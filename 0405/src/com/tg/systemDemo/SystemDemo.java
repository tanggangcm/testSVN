package com.tg.systemDemo;

import java.util.Arrays;

/**
 * @Description: SystemDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/21
 * @Version: 1.0
 */
public class SystemDemo {
    public static void main(String[] args) {
//        currentTimeMillisDemo();
        arrayCopyDemo();
    }
    public static void arrayCopyDemo() {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};
        System.out.println("复制前：" + Arrays.toString(dest));
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("复制后：" + Arrays.toString(dest));
    }
    public static void currentTimeMillisDemo() {
        System.out.println(System.currentTimeMillis());
        long l = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        System.out.println(System.currentTimeMillis() - l);
    }
}

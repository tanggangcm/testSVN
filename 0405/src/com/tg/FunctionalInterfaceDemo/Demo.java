package com.tg.FunctionalInterfaceDemo;

/**
 * @Description: Demol
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/16
 * @Version: 1.0
 */
public class Demo {
    public static void show(MyFunctionalInterface myInter) {
        myInter.method();
    }

    public static void main(String[] args) {
        show(() -> System.out.println("哈哈哈"));
    }
}

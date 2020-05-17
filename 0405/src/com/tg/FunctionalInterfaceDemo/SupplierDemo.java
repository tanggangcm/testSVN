package com.tg.FunctionalInterfaceDemo;

import java.util.function.Supplier;

/**
 * @Description: SupplierDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class SupplierDemo {
    public static void main(String[] args) {
        String string = getString(() -> "胡歌");
        System.out.println(string);
    }

    private static String getString(Supplier<String> sup) {
        return sup.get();
    }
}

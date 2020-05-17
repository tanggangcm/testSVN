package com.tg.FunctionalInterfaceDemo;

import java.util.function.Supplier;

/**
 * @Description: SupplierDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class SupplierTest {
    public static void main(String[] args) {
        int[] arr = {12,321,45,3211,43,32};
        int max1 = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });

        System.out.println(max1);
    }
    private static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}

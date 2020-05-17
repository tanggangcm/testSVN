package com.tg.FunctionalInterfaceDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description: ComparatorDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        String[] arr = {"fdsafdas", "rrtetgdsgf", "124sdf"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, getComparator());
        System.out.println(Arrays.toString(arr));
    }

    private static Comparator<String> getComparator() {
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        };

        return (s1, s2) -> s2.length() - s1.length();
    }
}

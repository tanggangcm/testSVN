package com.tg.FunctionalInterfaceDemo;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @Description: PredicateDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class PredicateTest {
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴, 女", "古力娜扎, 女", "马儿扎哈, 男", "赵丽颖, 女"};

        ArrayList<String> filter = filter(arr, s -> s.split(",")[0].length() == 4, s -> s.split(",")[1].equals(" 女"));

        for (String s : filter) {
            System.out.println(s);
        }
    }

    private static ArrayList<String> filter(String[] arr, Predicate<String> predicate1,
                                            Predicate<String> predicate2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean test = predicate1.and(predicate2).test(s);
            if(test) {
                list.add(s);
            }
        }
        return list;
    }
}

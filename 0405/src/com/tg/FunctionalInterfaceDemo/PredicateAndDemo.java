package com.tg.FunctionalInterfaceDemo;

import java.util.function.Predicate;

/**
 * @Description: PredicateDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class PredicateAndDemo {
    public static void main(String[] args) {
        String str = "nahgfdhgfdhgfdhdgf";
        boolean a = checkString(str, s -> s.length() > 5, s -> s.contains("a"));
        System.out.println(a);

        boolean b = checkString2(str, s -> s.length() > 5);
        System.out.println(b);
    }

    private static boolean checkString2(String str, Predicate<String> predicate) {
        return predicate.negate().test(str);
    }

    private static boolean checkString(String str, Predicate<String> predicate1, Predicate<String> predicate2) {
//        return predicate1.test(str) && predicate2.test(str);

//        return predicate1.and(predicate2).test(str);
        return predicate1.or(predicate2).test(str);
    }
}

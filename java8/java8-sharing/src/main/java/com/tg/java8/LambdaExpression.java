package com.tg.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExpression {
    @FunctionalInterface
    public interface Test {
        public void fun(int x, int y);
    }

    @FunctionalInterface
    public interface Test1 {
        public int fun();
    }

    public static void main(String[] args) {
        Comparator<Apple> byColor = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        };

        List<Apple> list = Collections.emptyList();

        list.sort(byColor);

        Comparator<Apple> byColor2 = (o1, o2) -> o1.getColor().compareTo(o2.getColor());


        Function<String, Integer> flambda = s -> s.length();

        Predicate<Apple> p = a -> a.getColor().equals("green");

        Test test = (int x, int y) -> {
            System.out.println(x);
            System.out.println(y);
        };

        Test1 test1 = () -> 43;

        Runnable runnable = () -> {};


    }
}

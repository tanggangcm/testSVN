package com.tg.java8;

import java.util.ArrayList;
import java.util.List;

public class FilterApple {
    public interface AppleFilter {
        boolean filter(Apple apple);
    }

    public static void main(String[] args) throws InterruptedException {
        /*List<Apple> list = Arrays.asList(new Apple("green", 150),
                new Apple("yellow", 120),
                new Apple("green", 170));

        List<Apple> apples = findApple(list, new GreenAnd150WeightFilter());

        System.out.println(apples);

        List<Apple> yellowApple = findApple(list, new AppleFilter() {
            @Override
            public boolean filter(Apple apple) {
                return "yellow".equals(apple.getColor());
            }
        });

        System.out.println(yellowApple);

        List<Apple> lambdaResult
                = findApple(list, apple -> "green".equals(apple.getColor()));

        System.out.println(lambdaResult);*/

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();

        Thread.currentThread().join();

    }

    public static List<Apple> findApple(List<Apple> appleList, AppleFilter appleFilter) {
        List<Apple> list = new ArrayList<>();

        for(Apple apple : appleList) {
            if(appleFilter.filter(apple)) {
                list.add(apple);
            }
        }
        return list;
    }

    public static class GreenAnd150WeightFilter implements AppleFilter {

        @Override
        public boolean filter(Apple apple) {
            return ("green".equals(apple.getColor()) && 150 == apple.getWeight());
        }
    }

    public static List<Apple> findGreenApple(List<Apple> appleList) {
        List<Apple> list = new ArrayList<>();

        for(Apple apple : appleList) {
            if("green".equals(apple.getColor())) {
                list.add(apple);
            }
        }

        return list;
    }
}

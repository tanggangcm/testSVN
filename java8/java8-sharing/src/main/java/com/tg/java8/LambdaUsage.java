package com.tg.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LambdaUsage {

    private static List<Apple> filter(List<Apple> source, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : source) {
            if(predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    private static List<Apple> filterByWeight(List<Apple> source, LongPredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : source) {
            if(predicate.test(apple.getWeight())) {
                result.add(apple);
            }
        }
        return result;
    }

    private static List<Apple> filterByBiPredicate(List<Apple> source, BiPredicate<String, Long> biPredicate) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : source) {
            if(biPredicate.test(apple.getColor(), apple.getWeight())) {
                result.add(apple);
            }
        }
        return result;
    }

    private static void simpleTestConsumer(List<Apple> source, Consumer<Apple> consumer) {
        for(Apple apple : source) {
            consumer.accept(apple);
        }
    }

    private static void simpleTestBiConsumer(String c,List<Apple> source, BiConsumer<Apple, String> biConsumer) {
        for(Apple apple : source) {
            biConsumer.accept(apple, c);
        }
    }

    private static String testFuncation(Apple apple, Function<Apple, String> function) {
        return function.apply(apple);
    }

    private static Apple testBiFunction(String color, long weight, BiFunction<String, Long, Apple> biFunction) {
        return biFunction.apply(color, weight);
    }

    public static void main(String[] args) {
//        Runnable r1 = () -> System.out.println("Hello");
//
//        Runnable r2 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        };
//
//        process(r1);
//        process(r2);
//        process(() -> System.out.println("Hello"));

        List<Apple> list = Arrays.asList(new Apple("green", 150),
                new Apple("yellow", 120),
                new Apple("green", 170));

        List<Apple> apples = filter(list, apple -> "green".equals(apple.getColor()));

        List<Apple> apples1 = filterByWeight(list, w -> w > 150);

        List<Apple> apples2 = filterByBiPredicate(list, (c, w) -> "green".equals(c) && w > 150);

        simpleTestConsumer(list, apple -> System.out.println(apple));

        System.out.println(apples2);

        System.out.println("=================================");

        simpleTestBiConsumer("XXX", list, (apple, c) -> System.out.println(c + apple.getColor()
                + ": Weight=>" + apple.getWeight()));

        String s = testFuncation(list.get(0), apple -> apple.getWeight() * 10 + "");

        System.out.println(s);

        Apple apple = testBiFunction("blue", 150, (c, w) -> new Apple(c, w));

        System.out.println(apple);

        Supplier<String> stringSupplier = String::new;
        System.out.println(stringSupplier.get().getClass());


        Apple red = createApple(() -> new Apple("red", 120));
        System.out.println(red);

    }

    private static void process(Runnable r) {
        r.run();
    }

    private static Apple createApple(Supplier<Apple> supplier) {
        return supplier.get();
    }

    @FunctionalInterface
    public interface Adder {

        int add(int a, int b);

    }

}

package com.tg.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefrence {

    public static void main(String[] args) {
        /*Consumer<String> consumer = s -> System.out.println(s);

        useConsumer(consumer, "Hello zheshijie");

        useConsumer(s -> System.out.println(s), "Hello");

        useConsumer(System.out::println, "hello");*/

        List<Apple> list = Arrays.asList(new Apple("green", 150),
                new Apple("yellow", 120),
                new Apple("green", 170));

        System.out.println(list);

        list.sort((a1, a2) -> a1.getColor().compareTo(a2.getColor()));

        System.out.println(list);

        list.stream().forEach(a -> System.out.println(a));


        System.out.println("==========================");

        list.stream().forEach(System.out::println);

        int value = Integer.parseInt("132");

        Function<String, Integer> f = Integer::parseInt;

        Integer apply = f.apply("123");

        System.out.println(apply);

        BiFunction<String, Integer, Character> f2 = String::charAt;
        Character c = f2.apply("hello", 2);
        System.out.println(c);

        String string = new String("Hello");
        Function<Integer, Character> f3 = string::charAt;
        Character c2 = f3.apply(4);
        System.out.println(c2);

        Supplier<String> supplier = String::new;

        String s = supplier.get();

        System.out.println(s);

        BiFunction<String, Long, Apple> appleFunction = Apple::new;
        Apple apple = appleFunction.apply("red", 100L);

        System.out.println(apple);

        ThreeFunction<String, Long, String, ComplexApple> threeFunction = ComplexApple::new;
        ComplexApple complexApple = threeFunction.apply("white", 123L, "newton");

        System.out.println(complexApple);

        List<Apple> list2 = Arrays.asList(new Apple("white", 150),
                new Apple("yellow", 120),
                new Apple("green", 170));

        list2.sort(Comparator.comparing(Apple::getColor));

        System.out.println(list2);
    }

    private static <T> void useConsumer(Consumer<T> consumer, T t) {
        consumer.accept(t);
        consumer.accept(t);
    }

}

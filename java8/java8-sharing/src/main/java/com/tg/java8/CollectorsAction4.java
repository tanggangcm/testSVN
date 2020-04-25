package com.tg.java8;

import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Optional;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.stream.Collectors;

import static com.tg.java8.CollectorsAction.menu;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

/**
 * @Description: CollectorsAction4
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/9
 * @Version: 1.0
 */
public class CollectorsAction4 {
    public static void main(String[] args) {
        /*testSummingDouble();
        testSummingLong();
        testSummingInt();
        testToCollection();
        testToConcurrentMap();
        testToConcurrentMapWithBinaryOperator();
        testToConcurrentMapWithBinaryOperatorAndSupplier();
        testToList();
        testToSet();*/
        testToMap();
        /*testToMapWithBinaryOperator();
        testToMapWithBinaryOperatorAndSupplier();*/
    }

    private static void testToMap() {
        System.out.println("testToMap");
        Optional.of(menu.stream().collect(Collectors
                .collectingAndThen(Collectors.toMap(Dish::getName,
                        Dish::getCalories), Collections::synchronizedMap)))
                .ifPresent(r -> {
                    System.out.println(r.getClass());
                    System.out.println(r);
                });

        /*Optional.of(menu.stream().collect(Collectors.toMap(Dish::getName,
                Dish::getCalories))).ifPresent(r -> {
            System.out.println(r.getClass());
            System.out.println(r);
        });*/
    }

    private static void testToMapWithBinaryOperator() {
        System.out.println("testToMapWithBinaryOperator");
        Optional.of(menu.stream().collect(Collectors.toMap(Dish::getName,
                v -> 1L, (a, b) -> a + b))).ifPresent(r -> {
            System.out.println(r.getClass());
            System.out.println(r);
        });
    }

    private static void testToMapWithBinaryOperatorAndSupplier() {
        System.out.println("testToMapWithBinaryOperatorAndSupplier");
        Optional.of(menu.stream().collect(Collectors.toMap(Dish::getName,
                v -> 1L, (a, b) -> a + b, Hashtable::new)))
                .ifPresent(r -> {
                    System.out.println(r.getClass());
                    System.out.println(r);
                });
    }

    private static void testToList() {
        Optional.of(menu.stream().filter(Dish::isVegetarian)
                .collect(Collectors.toList())).ifPresent(r -> {
            System.out.println(r.getClass());
            System.out.println(r);
        });
    }

    private static void testToSet() {
        Optional.of(menu.stream().filter(Dish::isVegetarian)
                .collect(Collectors.toSet())).ifPresent(r -> {
            System.out.println(r.getClass());
            System.out.println(r);
        });
    }

    private static void testToConcurrentMapWithBinaryOperatorAndSupplier() {
        System.out.println("testToConcurrentMapWithBinaryOperatorAndSupplier");
        Optional.of(menu.stream().collect(Collectors
                .toConcurrentMap(Dish::getType, v -> 1L, (a, b) -> a + b,
                        ConcurrentSkipListMap::new)))
                .ifPresent(v -> {
                    System.out.println(v);
                    System.out.println(v.getClass());
                });
    }

    /**
     * @return void
     * @Author tanggang@xiangzhitech.com
     * @Description // Type : Total
     * @Date 2020/4/9
     * @Param []
     */
    private static void testToConcurrentMapWithBinaryOperator() {
        System.out.println("testToConcurrentMapWithBinaryOperator");
        Optional.of(menu.stream().collect(Collectors
                .toConcurrentMap(Dish::getType, v -> 1L, (a, b) -> a + b)))
                .ifPresent(System.out::println);
    }

    private static void testToConcurrentMap() {
        System.out.println("testToConcurrentMap");
        Optional.of(menu.stream().collect(Collectors
                .toConcurrentMap(Dish::getName, Dish::getCalories)))
                .ifPresent(System.out::println);
    }

    private static void testToCollection() {
        System.out.println("testToCollection");
        Optional.of(menu.stream().filter(d -> d.getCalories() > 600)
                .collect(Collectors.toCollection(LinkedList::new)))
                .ifPresent(System.out::println);
    }

    private static void testSummingDouble() {
        System.out.println("testSummingDouble");
        Optional.of(menu.stream().collect(Collectors
                .summingDouble(Dish::getCalories)))
                .ifPresent(System.out::println);

        Optional.of(menu.stream().map(Dish::getCalories)
                .mapToInt(Integer::intValue).sum())
                .ifPresent(System.out::println);
    }

    private static void testSummingLong() {
        System.out.println("testSummingLong");
        Optional.of(menu.stream().collect(Collectors
                .summingLong(Dish::getCalories)))
                .ifPresent(System.out::println);
    }

    private static void testSummingInt() {
        System.out.println("testSummingInt");
        Optional.of(menu.stream().collect(Collectors
                .summingInt(Dish::getCalories)))
                .ifPresent(System.out::println);
    }
}

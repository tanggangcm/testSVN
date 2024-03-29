package com.tg.java8;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.stream.Collectors;

import static com.tg.java8.CollectorsAction.menu;
/**
 * @Description: CollectorsAction2
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/4
 * @Version: 1.0
 */
public class CollectorsAction2 {
    public static void main(String[] args) {
        /*testGroupByConcurrentWithFunction();
        testGroupByConcurrentWithFunctionAndCollector();
        testGroupByConcurrentWithFunctionAndSupplierAndCollector();
        testJoining();
        testJoiningWithDelimiter();
        testJoiningWithDelimiterAndPrefixAndSuffix();
        testMapping();*/
        testMaxBy();
        testMinBy();
    }
    private static void testMinBy() {
        System.out.println("testMinBy");
        menu.stream().collect(Collectors
                .minBy(Comparator.comparingInt(Dish::getCalories)))
                .ifPresent(System.out::println);
    }
    private static void testMaxBy() {
        System.out.println("testMaxBy");
        menu.stream().collect(Collectors
                .maxBy(Comparator.comparingInt(Dish::getCalories)))
                .ifPresent(System.out::println);
    }
    private static void testMapping() {
        System.out.println("testMapping");
        Optional.of(menu.stream().collect(Collectors
                .mapping(Dish::getName, Collectors.joining(","))))
                .ifPresent(System.out::println);
    }
    private static void testJoiningWithDelimiterAndPrefixAndSuffix() {
        System.out.println("testJoiningWithDelimiterAndPrefixAndSuffix");
        Optional.of(menu.stream().map(Dish::getName)
                .collect(Collectors.joining(",", "<", ">")))
                .ifPresent(System.out::println);
    }
    private static void testJoiningWithDelimiter() {
        System.out.println("testJoiningWithDelimiter");
        Optional.of(menu.stream().map(Dish::getName)
                .collect(Collectors.joining(",")))
                .ifPresent(System.out::println);
    }
    private static void testJoining() {
        System.out.println("testJoining");
        Optional.of(menu.stream().map(Dish::getName)
                .collect(Collectors.joining())).ifPresent(System.out::println);

    }
    private static void testGroupByConcurrentWithFunctionAndSupplierAndCollector() {
        System.out.println("testGroupByConcurrentWithFunctionAndSupplierAndCollector");
        ConcurrentMap<Dish.Type, Double> collect = menu.stream()
                .collect(Collectors.groupingByConcurrent(Dish::getType,
                ConcurrentSkipListMap::new, Collectors.averagingLong(Dish::getCalories)));
        Optional.of(collect.getClass()).ifPresent(System.out::println);
        Optional.of(collect).ifPresent(System.out::println);
    }
    private static void testGroupByConcurrentWithFunctionAndCollector() {
        System.out.println("testGroupByConcurrentWithFunctionAndCollector");
        ConcurrentMap<Dish.Type, Double> collect = menu.stream()
                .collect(Collectors.groupingByConcurrent(Dish::getType,
                Collectors.averagingInt(Dish::getCalories)));
        Optional.of(collect.getClass()).ifPresent(System.out::println);
        Optional.of(collect).ifPresent(System.out::println);
    }
    private static void testGroupByConcurrentWithFunction() {
        System.out.println("testGroupByConcurrentWithFunction");
        ConcurrentMap<Dish.Type, List<Dish>> collect = menu.stream()
                .collect(Collectors.groupingByConcurrent(Dish::getType));
        Optional.of(collect.getClass()).ifPresent(System.out::println);
        Optional.of(collect).ifPresent(System.out::println);
    }
}

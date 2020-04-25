package com.tg.java8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description: CollectorsAction
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/3
 * @Version: 1.0
 */
public class CollectorsAction {
    public static void main(String[] args) {
        /*testAveragingDouble();
        testAveragingInt();
        testAveragingLong();
        testCollectingAndThen();
        testCounting();
        testGroupByFunction();
        testGroupByFunctionAndCollector();
        testGroupByFunctionAndSupplierAndCollector();*/
        testSummerizingInt();
    }
    private static void testSummerizingInt() {
        System.out.println("testSummerizingIng()");
        IntSummaryStatistics collect = menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        Optional.of(collect).ifPresent(System.out::println);
    }
    private static void testGroupByFunctionAndSupplierAndCollector() {
        System.out.println("testGroupByFunctionAndSupplierAndCollector");
        Map<Dish.Type, Double> collect = menu.stream().collect(Collectors
                .groupingBy(Dish::getType, TreeMap::new, Collectors.averagingInt(Dish::getCalories)));

        Optional.ofNullable(collect.getClass()).ifPresent(System.out::println);
        Optional.of(collect).ifPresent(System.out::println);
    }
    private static void testGroupByFunctionAndCollector() {
        System.out.println("testGroupByFunctionAndCollector");
        Optional.ofNullable(menu.stream().collect(Collectors
                .groupingBy(Dish::getType, Collectors.averagingInt(Dish::getCalories))))
                .ifPresent(System.out::println);
    }
    private static void testGroupByFunction() {
        System.out.println("testGroupByFunction");
        Optional.ofNullable(menu.stream().collect(Collectors.groupingBy(Dish::getType)))
                .ifPresent(System.out::println);
    }
    private static void testCounting() {
        System.out.println("testCounting");
        Optional.of(menu.stream().collect(Collectors.counting())).ifPresent(System.out::println);
    }
    private static void testCollectingAndThen() {
        System.out.println("testCollectingAndThen");
        Optional.ofNullable(menu.stream().collect(Collectors
                .collectingAndThen(Collectors
                        .averagingInt(Dish::getCalories),
                        a -> "The Average Calories is -> " + a)))
                .ifPresent(System.out::println);

        List<Dish> collect = menu.stream().filter(d -> d.getType().equals(Dish.Type.MEAT))
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));

        collect.add(new Dish("", false, 100, Dish.Type.OTHER));
        System.out.println(collect);
    }
    private static void testAveragingLong() {
        System.out.println("testAveragingLong");
        Optional.ofNullable(menu.stream()
                .collect(Collectors.averagingLong(Dish::getCalories)))
                .ifPresent(System.out::println);
    }
    private static void testAveragingInt() {
        System.out.println("testAveragingInt");
        Optional.ofNullable(menu.stream()
                .collect(Collectors.averagingInt(Dish::getCalories)))
                .ifPresent(System.out::println);
    }
    private static void testAveragingDouble() {
        System.out.println("testAveragingDouble");
        Optional.ofNullable(menu.stream()
                .collect(Collectors.averagingDouble(Dish::getCalories)))
                .ifPresent(System.out::println);
    }
    public final static List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH));
}

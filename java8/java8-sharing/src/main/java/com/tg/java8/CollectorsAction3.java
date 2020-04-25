package com.tg.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import static com.tg.java8.CollectorsAction.menu;

/**
 * @Description: CollectorsAction3
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/5
 * @Version: 1.0
 */
public class CollectorsAction3 {
    public static void main(String[] args) {
        /*testPartitioningByWithPredicate();
        testPartitioningByWithPredicateAndCollector();
        testReducingBinaryOperator();
        testReducingBinaryOperatorAndIdentity();
        testReducingBinaryOperatorAndIdentityAndFunction();*/
        testSummarizingDouble();
        testSummarizingLong();
        testSummarizingInt();
    }
    private static void testSummarizingDouble() {
        System.out.println("testSummarizingDouble");
        Optional.of(menu.stream().collect(Collectors
                .summarizingDouble(Dish::getCalories)))
                .ifPresent(System.out::println);
    }
    private static void testSummarizingLong() {
        System.out.println("testSummarizingLong");
        Optional.of(menu.stream().collect(Collectors
                .summarizingLong(Dish::getCalories)))
                .ifPresent(System.out::println);
    }
    private static void testSummarizingInt() {
        System.out.println("testSummarizingInt");
        Optional.of(menu.stream().collect(Collectors
                .summarizingInt(Dish::getCalories)))
                .ifPresent(System.out::println);
    }
    private static void testReducingBinaryOperatorAndIdentityAndFunction() {
        System.out.println("testReducingBinaryOperatorAndIdentityAndFunction");
        Integer collect = menu.stream().collect(Collectors.reducing(0,
                Dish::getCalories, Integer::sum));
        System.out.println(collect);
    }
    private static void testReducingBinaryOperatorAndIdentity() {
        System.out.println("testReducingBinaryOperatorAndIdentity");
        Integer collect = menu.stream().map(Dish::getCalories)
                .collect(Collectors.reducing(0, Integer::sum));
        System.out.println(collect);
    }
    private static void testReducingBinaryOperator() {
        System.out.println("testReducingBinaryOperator");
        menu.stream().collect(Collectors.reducing(BinaryOperator
                .maxBy(Comparator.comparingInt(Dish::getCalories))))
                .ifPresent(System.out::println);
    }
    private static void testPartitioningByWithPredicateAndCollector() {
        System.out.println("testPartitioningByWithPredicateAndCollector");
        Map<Boolean, Double> collect = menu.stream().collect(Collectors
                .partitioningBy(Dish::isVegetarian, Collectors
                        .averagingInt(Dish::getCalories)));
        Optional.of(collect).ifPresent(System.out::println);
    }
    private static void testPartitioningByWithPredicate() {
        System.out.println("testPartitioningByWithPredicate");
        Map<Boolean, List<Dish>> collect = menu.stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        Optional.of(collect).ifPresent(System.out::println);
    }
}

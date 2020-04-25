package com.tg.java8;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

/**
 * @Description: CollectorIntroduce
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/3
 * @Version: 1.0
 */
public class CollectorIntroduce {
    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(
                new Apple("green", 150),
                new Apple("yellow", 120),
                new Apple("green", 170),
                new Apple("green", 150),
                new Apple("yellow", 120),
                new Apple("green", 170)
        );

        Optional.ofNullable(appleList.stream()
                .filter(a -> a.getColor().equals("green"))
                .collect(toList()))
                .ifPresent(System.out::println);

        Optional.ofNullable(groupByNormal(appleList))
                .ifPresent(System.out::println);

        Optional.ofNullable(groupByFunctoin(appleList))
                .ifPresent(System.out::println);

        System.out.println("=====================================");
        Optional.ofNullable(groupByCollect(appleList))
                .ifPresent(System.out::println);
    }

    private static Map<String, List<Apple>> groupByCollect(List<Apple> appleList) {
        return appleList.stream().collect(groupingBy(Apple::getColor));
    }

    private static Map<String, List<Apple>> groupByFunctoin(List<Apple> appleList) {
        Map<String, List<Apple>> map = new HashMap<>();
        appleList.stream().forEach(a -> {
            List<Apple> colorList = Optional.ofNullable(map.get(a.getColor()))
                    .orElseGet(() -> {
                        List<Apple> list = new ArrayList<>();
                        map.put(a.getColor(), list);
                        return list;
                    });
            colorList.add(a);
        });

        return map;
    }

    private static Map<String, List<Apple>> groupByNormal(List<Apple> appleList) {
        Map<String, List<Apple>> map = new HashMap<>();
        for(Apple a : appleList) {
            List<Apple> apples = map.get(a.getColor());
            if(null == apples) {
                apples = new ArrayList<>();
                map.put(a.getColor(), apples);
            }
            apples.add(a);
        }
        return map;
    }
}

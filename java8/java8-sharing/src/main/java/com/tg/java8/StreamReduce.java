package com.tg.java8;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 3, 5, 2);

        Integer reduce = integers.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

        integers.stream().reduce((i, j) -> i + j).ifPresent(System.out::println);

        integers.stream().reduce(Integer::max).ifPresent(System.out::println);

        integers.stream().reduce(Integer::min).ifPresent(System.out::println);

        integers.stream().filter(i -> i % 2 == 0).reduce((i, j) -> i * j)
                .ifPresent(System.out::println);
    }
}

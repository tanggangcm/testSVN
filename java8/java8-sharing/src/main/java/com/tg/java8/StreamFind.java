package com.tg.java8;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamFind {
    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 3, 5, 2});

        /*Optional<Integer> optional1 = stream.filter(i -> i % 2 == 0).findAny();
        System.out.println(optional1.get());

        stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 3, 5, 2});
        Optional<Integer> optional2 = stream.filter(i -> i % 2 == 0).findFirst();
        System.out.println(optional2.get());
*/
        stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 3, 5, 2});
        Optional<Integer> optional3 = stream.filter(i -> i > 1).findFirst();
        System.out.println(optional3.orElse(-1));
        optional3.ifPresent(System.out::println);

        int result = find(new Integer[]{1, 2, 3, 4, 5, 6, 7, 3, 5, 2}, -1, i -> i > 100);
        System.out.println(result);

    }

    private static int find(Integer[] values, int defaultValue, Predicate<Integer> predicate) {
        for(int t : values) {
            if(predicate.test(t)) {
                return t;
            }
        }
        return defaultValue;
    }
}

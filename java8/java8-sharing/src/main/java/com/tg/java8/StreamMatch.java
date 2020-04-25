package com.tg.java8;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMatch {
    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 3, 5, 2});

        boolean b = stream.allMatch(i -> i > 0);

        System.out.println(b);

        stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 3, 5, 2});
        b = stream.anyMatch(i -> i > 6);
        System.out.println(b);

        stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 3, 5, 2});
        b = stream.noneMatch(i -> i < 0);
        System.out.println(b);

    }
}

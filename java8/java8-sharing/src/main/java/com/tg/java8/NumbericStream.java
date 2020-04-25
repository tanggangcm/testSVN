package com.tg.java8;

import java.util.stream.IntStream;

/**
 * @Description: NumbericStream
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/2
 * @Version: 1.0
 */
public class NumbericStream {
    public static void main(String[] args) {
        /*Integer[] it = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        List<Integer> itList = Arrays.asList(it);

        Integer reduce = itList.stream().filter(i -> i.intValue() > 3).reduce(0, Integer::sum);
        System.out.println(reduce);

        int sum = itList.stream().mapToInt(i -> i.intValue()).filter(i -> i > 3).sum();
        System.out.println(sum);*/


        int a = 9;
        IntStream.rangeClosed(1, 100)
                .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                .boxed()
                .map(b -> new int[]{a, b, (int)Math.sqrt(a * a + b * b)})
                .forEach(r -> System.out.println("a=" + r[0] + ", b=" + r[1] + ", c=" + r[2]));


        IntStream.rangeClosed(1, 100)
                .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                .mapToObj(b -> new int[]{a, b, (int)Math.sqrt(a * a + b * b)})
                .forEach(r -> System.out.println("a=" + r[0] + ", b=" + r[1] + ", c=" + r[2]));

    }
}

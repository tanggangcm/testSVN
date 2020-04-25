package com.tg.java8;

import java.util.function.Function;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @Description: ParallelProcessing
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/9
 * @Version: 1.0
 */
public class ParallelProcessing {
    public static void main(String[] args) {
        byte b = 1_0_0;
        short s = 1_0_0_0;
        int i = 1_0_0_0;
        long l = 10_0_000_0L;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("The best process time(normalAdd) => " +
                measureSumPerformance(ParallelProcessing::normalAdd, 1_000_000_000L));
//        System.out.println("The best process time(iterateStream) => " +
//                measureSumPerformance(ParallelProcessing::iterateStream, 10_000_000L));
//        System.out.println("The best process time(parallelStream) => " +
//                measureSumPerformance(ParallelProcessing::parallelStream, 10_000_000L));
//        System.out.println("The best process time(parallelStream2) => " +
//                measureSumPerformance(ParallelProcessing::parallelStream2, 10_000_000L));
        System.out.println("The best process time(parallelStream3) => " +
                measureSumPerformance(ParallelProcessing::parallelStream3, 1_000_000_000L));
    }

    private static long measureSumPerformance(Function<Long, Long> adder, long limit) {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long startTimestamp = System.currentTimeMillis();
            long result = adder.apply(limit);
            long duration = System.currentTimeMillis() - startTimestamp;
//            System.out.println("The result of sum => " + result);
            if (duration < fastest) {
                fastest = duration;
            }
        }
        return fastest;
    }

    private static long iterateStream(long limit) {
        return Stream.iterate(0L, i -> i + 1).limit(limit)
                .reduce(0L, Long::sum);
    }

    private static long parallelStream(long limit) {
        return Stream.iterate(0L, i -> i + 1).parallel()
                .limit(limit).reduce(0L, Long::sum);
    }

    private static long parallelStream2(long limit) {
        return Stream.iterate(0L, i -> i + 1).mapToLong(Long::longValue)
                .parallel().limit(limit).reduce(0L, Long::sum);
    }

    private static long parallelStream3(long limit) {
        return LongStream.rangeClosed(1, limit).parallel().reduce(0L, Long::sum);
    }

    private static long normalAdd(long limit) {
        long result = 0L;
        for (long i = 0L; i < limit; i++) {
            result += i;
        }
        return result;
    }
}

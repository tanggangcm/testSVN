package com.tg.java8;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * @Description: ToListCollector
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/9
 * @Version: 1.0
 */
public class ToListCollector<T> implements Collector<T, List<T>, List<T>> {
    private void log(final String log) {
        System.out.println(Thread.currentThread().getName() + "-" + log);
    }

    @Override
    public Supplier<List<T>> supplier() {
        log("supplier");
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<T>, T> accumulator() {
        log("accumulator");
        return List::add;
    }

    @Override
    public BinaryOperator<List<T>> combiner() {
        log("combiner");
        return (list1, list2) -> {
            list1.addAll(list2);
            return list1;
        };
    }

    @Override
    public Function<List<T>, List<T>> finisher() {
        log("finisher");
        return t -> t;
    }

    @Override
    public Set<Characteristics> characteristics() {
        log("characteristics");
        return Collections.unmodifiableSet(EnumSet
                .of(Characteristics.IDENTITY_FINISH,
                        Characteristics.CONCURRENT));
    }
}

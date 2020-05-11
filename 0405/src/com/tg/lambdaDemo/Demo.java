package com.tg.lambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description: Demo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/10
 * @Version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
//        arraysDemo();
        invokeCalculator(12, 45, (a, b) -> a + b);
    }

    private static void invokeCalculator(int a, int b, Calculator calculator) {
        int add = calculator.add(a, b);
        System.out.println(add);
    }

    private static void arraysDemo() {
        Person[] people = {new Person("A", 45),
                new Person("V", 4),
                new Person("B", 15),
                new Person("D", 55)};

        Arrays.sort(people, Comparator.comparingInt(Person::getAge));

        System.out.println(Arrays.toString(people));
    }

    private static void lambdaDemo() {
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }

    private static void runnableDemo() {
        new Thread(new RunnableDemo()).start();
    }
}

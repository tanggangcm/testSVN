package com.tg.streamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Description: Demo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
//        forEachDemo();
//        filterDemo();
//        mapDemo();
//        countDemo();
//        limitDemo();
//        skipDemo();
//        concatDemo();
//        printableDemo01(s -> System.out.println(s));
//        printableDemo01(System.out::println);
//        printableDemo01(MethodRerferenceObject::printUpperCaseString);

//        int method = method(-12, n -> Math.abs(n));
//        System.out.println(method);
//
//        int method1 = method(-12, Math::abs);
//        System.out.println(method1);

//        printName("张三", Person::new);

        int[] array = createArray(12, len -> new int[len]);
        System.out.println(array.length);

        int[] array1 = createArray(12, int[]::new);
        System.out.println(array1.length);
    }

    private static int[] createArray(int length, ArrayBuilder ab) {
        return ab.builderArray(length);
    }

    public static void printName(String name, PersonBuilder pb) {
        Person person = pb.builderPerson(name);
        System.out.println(person);
    }

    private static int method(int number, Calcable calcable) {
        return calcable.calsAbs(number);
    }

    private static void printableDemo01(Printable p) {
        p.print("fdhafjdksahgfjkdashjkfsd");
    }

    private static void concatDemo() {
        String[] arr = {"喜羊羊", "美羊羊", "懒洋洋", "灰太狼", "红太狼"};
        Stream<String> stream1 = Stream.of(arr);
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");

        Stream.concat(stream, stream1).forEach(System.out::println);
    }

    private static void skipDemo() {
        String[] arr = {"喜羊羊", "美羊羊", "懒洋洋", "灰太狼", "红太狼"};
        Stream<String> arr1 = Stream.of(arr);
        arr1.skip(3).forEach(System.out::println);
    }

    private static void limitDemo() {
        String[] arr = {"喜羊羊", "美羊羊", "懒洋洋", "灰太狼", "红太狼"};
        Stream<String> stream = Stream.of(arr);
        stream.limit(3).forEach(System.out::println);

    }

    private static void countDemo() {
        Stream<String> stream = Stream.of("张无忌", "周芷若", "张翠山");
        System.out.println(stream.count());
    }

    private static void mapDemo() {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        stream.map(Integer::parseInt).forEach(System.out::println);
    }

    private static void filterDemo() {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        stream.filter(name -> name.startsWith("张")).forEach(System.out::println);
    }

    private static void forEachDemo() {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        stream.forEach(name -> System.out.print(name));
//        stream.forEach(System.out::println);
    }

    private static void demo() {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        List<String> listA = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张")) {
                listA.add(s);
            }
        }

        List<String> shortList = new ArrayList<>();
        for (String s : listA) {
            if(s.length() == 3) {
                shortList.add(s);
            }
        }

        for (String s : shortList) {
            System.out.println(s);
        }
    }
}

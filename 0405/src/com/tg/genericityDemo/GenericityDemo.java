package com.tg.genericityDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description: GenericityDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/22
 * @Version: 1.0
 */
public class GenericityDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("这是");
        arrayList1.add("添加");

        printArray(arrayList);
        printArray(arrayList1);
        /*GenericInterfaceImpl genericInterface = new GenericInterfaceImpl();
        genericInterface.method("这是什么");

        GenericInterface<String> genericInterface1 = new GenericInterface2Impl();
        genericInterface1.method("gsgdsjghs");*/
        /*GenericMethod gm = new GenericMethod();
        gm.method1("fdsfafa");
        gm.method1(120);
        gm.method1('中');
        gm.method1(12.4);

        GenericMethod.method2("fdsajfhdsakj");
        GenericMethod.method2(123);
        GenericMethod.method2(12.4);
        GenericMethod.method2(true);
        GenericMethod.method2('国');*/

        /*GenericityClass<Integer> gc = new GenericityClass<>();

        gc.setName(10);

        Integer name = gc.getName();

        System.out.println(name);


        GenericityClass<String> gc2 = new GenericityClass<>();
        gc2.setName("gc2");
        String name1 = gc2.getName();

        System.out.println(name1);*/
//        show1();
//        show2();
//        long one = 1587538132000L;
//        long two = 1591949285000L;
//        Date date1 = new Date(one);
//        Date date2 = new Date(two);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
//        String format1 = simpleDateFormat.format(date1);
//        String format2 = simpleDateFormat.format(date2);
//        System.out.println(format1);
//        System.out.println(format2);
    }
    private static void printArray(ArrayList<?> arr) {
        Iterator<?> iterator = arr.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    private static void show2() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("张三");
        strings.add("李四");

        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next().length());
        }

        System.out.println("--------------------");
        for(String s : strings) {
            System.out.println(s);
        }
    }

    private static void show1() {
        ArrayList objects = new ArrayList();
        objects.add("abc");
        objects.add(1);

        Iterator iterator = objects.iterator();
        while(iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}

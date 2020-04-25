package com.tg.collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @Description: ConllectionDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/21
 * @Version: 1.0
 */
public class ConllectionDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("张三");
        collection.add("李四");
        collection.add("王五");
        collection.add("赵六");
        collection.add("田七");
        collection.add("丁拔");
        System.out.println(collection);


        collection.remove("张三");
        System.out.println(collection);

        boolean lisi = collection.contains("李四");
        System.out.println(lisi);

        boolean empty = collection.isEmpty();
        System.out.println(empty);

        int size = collection.size();
        System.out.println(size);

        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));

        collection.clear();
        System.out.println(collection);
    }
}

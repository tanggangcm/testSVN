package com.tg.ListAndSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @Description: SetDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/28
 * @Version: 1.0
 */
public class SetDemo {
    public static void main(String[] args) {
        //无序 + 不重复
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("zheshi");
        hashSet.add("yige");
        hashSet.add("ceshi");
        System.out.println(hashSet);

        //有序 + 不重复
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("zheshi");
        linkedHashSet.add("yige");
        linkedHashSet.add("ceshi");
        System.out.println(linkedHashSet);

        /*Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(5);
        set.add(1);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-------");
        for (Integer integer : set) {
            System.out.println(integer);
        }*/
    }
}

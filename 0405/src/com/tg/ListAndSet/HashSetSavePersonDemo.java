package com.tg.ListAndSet;

import java.util.HashSet;

/**
 * @Description: HashSetSavePersonDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/28
 * @Version: 1.0
 */
/* HashSet 储存自定义类型元素

    set集合保存元素唯一：
        储存的元素， 必须重写hashCode方法和equals方法

    要求：
        同名同姓同年龄的视为同一个人，只能储存一次
 */
public class HashSetSavePersonDemo {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小美女", 18);
        Person p2 = new Person("小美女", 18);
        Person p3 = new Person("小美女", 19);

        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println(set);
    }
}

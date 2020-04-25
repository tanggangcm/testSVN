package com.tg.packClass;

/**
 * @Description: PackClassDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/21
 * @Version: 1.0
 */
public class PackClassDemo {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer integer = new Integer("10");
        System.out.println(i);
        System.out.println(integer);

        Integer integer1 = Integer.valueOf(11);
        System.out.println(integer1);

        Integer integer2 = Integer.valueOf("100");
        System.out.println(integer2);

        int i1 = integer2.intValue();
    }
}

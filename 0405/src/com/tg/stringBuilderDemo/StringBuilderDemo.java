package com.tg.stringBuilderDemo;

/**
 * @Description: StringBuilderDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/21
 * @Version: 1.0
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder abc = sb.append("abc");
        StringBuilder cbn = abc.append("cbn");
        System.out.println(abc == cbn);
        System.out.println(cbn);
    }
}

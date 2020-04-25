package com.tg.equalsDemo;

import java.util.Date;
import java.util.Objects;

/**
 * @Description: Demo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/18
 * @Version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "abc";

//        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2));
        System.out.println(new Date(3742777636267L));
    }
}

package com.tg.genericityDemo;

/**
 * @Description: GenericMethod
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/26
 * @Version: 1.0
 */
public class GenericMethod {
    public <M> void method1(M m) {
        System.out.println(m);
    }

    public static <S> void method2(S s) {
        System.out.println(s);
    }
}

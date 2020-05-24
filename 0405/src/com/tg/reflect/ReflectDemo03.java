package com.tg.reflect;

import com.tg.reflect.domain.Person;

import java.lang.reflect.Constructor;

/**
 * @Description: ReflectDemo01
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);

        Object o = constructor.newInstance("张三", 12);
        System.out.println(o);
    }
}

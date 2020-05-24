package com.tg.reflect;

import com.tg.reflect.domain.Person;

/**
 * @Description: ReflectDemo01
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("com.tg.reflect.domain.Person");
        System.out.println(cls);

        Class cls1 = Person.class;
        System.out.println(cls1);

        Class cls2 = new Person().getClass();
        System.out.println(cls2);

        System.out.println(cls == cls1);
        System.out.println(cls == cls2);
    }
}

package com.tg.reflect;

import com.tg.reflect.domain.Person;

import java.lang.reflect.Method;

/**
 * @Description: ReflectDemo01
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class ReflectDemo04 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Method eat = personClass.getMethod("eat");
        Person p = new Person();
        eat.invoke(p);

        Method eat1 = personClass.getMethod("eat", String.class);
        eat1.invoke(p, "鸡腿");
    }
}

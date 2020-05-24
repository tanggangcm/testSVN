package com.tg.reflect;

import com.tg.reflect.domain.Person;

import java.lang.reflect.Field;

/**
 * @Description: ReflectDemo01
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        //getFields()   只能获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("-=------------");

        //getField()   只能获取指定名称的public修饰的成员变量
        Field a = personClass.getField("a");
        System.out.println(a);
        Object value = a.get(new Person());
        System.out.println(value);

        Person person = new Person();
        a.set(person, 12);
        System.out.println(person);

        System.out.println("-------------------------");
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        Field d = personClass.getDeclaredField("d");
        //忽略访问权限修饰符的安全检查
        d.setAccessible(true);  //暴力反射
        Object value2 = d.get(person);
        System.out.println(value2);
    }
}

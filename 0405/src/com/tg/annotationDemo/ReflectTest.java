package com.tg.annotationDemo;

import java.lang.reflect.Method;

/**
 * @Description: ReflectTest
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */

@Pro(className = "com.tg.annotationDemo.Demo1", methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Class aClass = ReflectTest.class;
        Pro an = (Pro) aClass.getAnnotation(Pro.class);

        String className = an.className();
        String methodName = an.methodName();

        Class aClass1 = Class.forName(className);
        Method method = aClass1.getMethod(methodName);
        method.invoke(aClass1.newInstance());
    }
}

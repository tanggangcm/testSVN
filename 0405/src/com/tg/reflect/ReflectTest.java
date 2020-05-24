package com.tg.reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Description: ReflectTest
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
//        Person person = new Person();
//        person.eat();
        Properties properties = new Properties();
        InputStream is = ReflectTest.class.getClassLoader().getResourceAsStream("com/tg/reflect/prop.properties");
        properties.load(is);

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        Class aClass = Class.forName(className);

        Method method = aClass.getMethod(methodName);
        method.invoke(aClass.newInstance());
    }
}

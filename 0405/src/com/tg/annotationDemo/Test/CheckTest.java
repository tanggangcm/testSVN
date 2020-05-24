package com.tg.annotationDemo.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @Description: CheckTest
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/18
 * @Version: 1.0
 */
public class CheckTest {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        Class aClass = calculator.getClass();

        Method[] methods = aClass.getMethods();

        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            if(method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    number++;
                    bw.write(method.getName() + "方法出异常了");
                    bw.newLine();
                    bw.write("异常的名称：" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因：" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("---------------------------------");
                    bw.newLine();
                }
            }
        }

        bw.write("本次共出现 " + number + "次异常");
        bw.flush();
        bw.close();
    }
}

package com.tg.junit;

/**
 * @Description: CalculatorTest
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int add = calculator.add(1, 2);
        System.out.println(add);
    }
}

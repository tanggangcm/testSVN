package com.tg.junit.test;

import com.tg.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Description: CalculatorTest
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class CalculatorTest {
    @Before
    public void init() {
        System.out.println("init");
    }

    @After
    public void close() {
        System.out.println("close");
    }

    @Test
    public void testAdd() {
//        int a = 1/0;
        Calculator calculator = new Calculator();
        int add = calculator.add(12, 7);

        Assert.assertEquals(19, add);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int sub = calculator.sub(45, 78);

        Assert.assertEquals(-33, sub);
    }
}

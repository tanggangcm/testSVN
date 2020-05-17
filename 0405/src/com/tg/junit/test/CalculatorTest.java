package com.tg.junit.test;

import com.tg.junit.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Description: CalculatorTest
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class CalculatorTest {
    @Test
    public void testAdd() {
//        int a = 1/0;
        Calculator calculator = new Calculator();
        int add = calculator.add(12, 7);

        Assert.assertEquals(1, add);
    }
}

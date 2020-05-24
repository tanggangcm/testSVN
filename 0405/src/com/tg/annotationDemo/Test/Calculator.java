package com.tg.annotationDemo.Test;

/**
 * @Description: Calculator
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/18
 * @Version: 1.0
 */
public class Calculator {
    @Check
    public void add() {
        String str = null;
        str.toString();
        System.out.println("1 + 0 = " + (1 + 0));
    }
    @Check
    public void sub() {
        System.out.println("1 - 0 = " + (1 - 0));
    }
    @Check
    public void mul() {
        System.out.println("1 * 0 = " + (1 * 0));
    }
    @Check
    public void div() {
        System.out.println("1 / 0 = " + (1 / 0));
    }

    public void show() {
        System.out.println("永无bug......");
    }
}

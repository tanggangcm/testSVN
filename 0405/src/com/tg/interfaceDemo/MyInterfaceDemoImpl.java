package com.tg.interfaceDemo;

/**
 * @Description: MyInterfaceDemoImpl
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/10
 * @Version: 1.0
 */
public class MyInterfaceDemoImpl implements MyInterfaceDemo {
    @Override
    public void methodAbsA() {
        System.out.println("java7中接口的抽象方法methodAbsA");
    }

    @Override
    public void methodAbsB() {
        System.out.println("java7中接口的抽象方法methodAbsB");
    }

    @Override
    public void methodAbsC() {
        System.out.println("java7中接口的抽象方法methodAbsC");
    }

    @Override
    public void methodAbsD() {
        System.out.println("java7中接口的抽象方法methodAbsD");
    }
}

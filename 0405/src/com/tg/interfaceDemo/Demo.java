package com.tg.interfaceDemo;

/**
 * @Description: Demo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/10
 * @Version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        MyInterfaceDemoImpl impl = new MyInterfaceDemoImpl();
        impl.methodAbsA();
        impl.methodAbsB();
        impl.methodAbsC();
        impl.methodAbsD();

        impl.methodDefaultA();

//        impl.methodStatic();报错
        MyInterfaceDemo.methodStatic();

        System.out.println(MyInterfaceDemo.NUM_OF_MY_CLASS);
    }
}

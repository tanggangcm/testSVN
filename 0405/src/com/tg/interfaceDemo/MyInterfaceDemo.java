package com.tg.interfaceDemo;

/**
 * @Description: MyInterfaceDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/10
 * @Version: 1.0
 */
public interface MyInterfaceDemo {
    public static final int NUM_OF_MY_CLASS = 10;


    public abstract void methodAbsA();
    public void methodAbsB();
    abstract void methodAbsC();
    void methodAbsD();

    public default void methodDefaultA() {
        System.out.println("这是一个java8中接口的默认方法");
//        methodPrivate();
    }

    public default void methodDefaultB() {
        System.out.println("这是一个java8中接口的默认方法");
//        methodPrivate();
    }

    public static void methodStatic() {
        System.out.println("java8中接口的静态方法");
    }

    /*private void methodPrivate() {
        System.out.println("java9中接口的私有方法");
    }*/

    /*private static void methodStaticPrivate() {
        System.out.println("java9中接口的静态私有方法");
    }*/
}

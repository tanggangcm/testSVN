package com.tg.threadDemo;

/**
 * @Description: Demo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/5
 * @Version: 1.0
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
//        show01();
//        show02();
//        show03();
//        System.out.println(Thread.currentThread());
        show04();
//        show05();
    }
    public static void show05() {
        Runnable runnable = new LockDemo();
        Thread thread = new Thread(runnable);

        thread.start();
    }
    private static void show04() {
        Runnable runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);

        thread.start();
    }

    private static void show03() throws InterruptedException {
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    public static void show02() {
        MyThread myThread = new MyThread();
        myThread.start();
//        new MyThread().start();
//        new MyThread().start();
//        for (int i = 0; i < 20; i++) {
//            System.out.println("main -->" + i);
//        }
    }
    public static void show01() {
        Person p1 = new Person("p1");
        p1.run();

        Person p2 = new Person("p2");
        p2.run();
    }
}

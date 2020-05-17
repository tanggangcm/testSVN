package com.tg.streamDemo;

/**
 * @Description: Man
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
public class Man extends Human {
    @Override
    public void sayHello() {
        System.out.println("hello man");
    }

    public void method(Greetable greetable) {
        greetable.greet();
    }

    public void show() {
//        method(() -> new Human().sayHello());
//        method(() -> super.sayHello());

        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}

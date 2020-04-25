package com.tg.java8;

import java.util.Optional;

/**
 * @Description: Preson
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/2
 * @Version: 1.0
 */
public class Person {
    private Optional<Car> car;

    public Optional<Car> getCar() {
        return this.car;
    }
}

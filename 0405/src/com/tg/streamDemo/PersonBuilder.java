package com.tg.streamDemo;

/**
 * @Description: PersonBuilder
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/17
 * @Version: 1.0
 */
@FunctionalInterface
public interface PersonBuilder {
    Person builderPerson(String name);
}

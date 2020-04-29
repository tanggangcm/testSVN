package com.tg.genericityDemo;

/**
 * @Description: GenericityClass
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/26
 * @Version: 1.0
 */
public class GenericityClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}

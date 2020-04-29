package com.tg.genericityDemo;

/**
 * @Description: GenericInterface2Impl
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/26
 * @Version: 1.0
 */
public class GenericInterface2Impl<I> implements GenericInterface<I> {
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}

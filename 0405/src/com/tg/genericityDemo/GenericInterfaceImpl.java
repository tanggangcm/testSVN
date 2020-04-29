package com.tg.genericityDemo;

/**
 * @Description: GenericInterfaceImpl
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/26
 * @Version: 1.0
 */
public class GenericInterfaceImpl implements GenericInterface<String> {
    @Override
    public void method(String i) {
        System.out.println(i);
    }
}

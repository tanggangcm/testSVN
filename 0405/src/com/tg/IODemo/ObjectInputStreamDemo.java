package com.tg.IODemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Description: ObjectInputStreamDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/16
 * @Version: 1.0
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("0405/src/com/tg/IODemo/person.txt"));

        Object o = ois.readObject();

        ois.close();

        System.out.println(o);
    }
}

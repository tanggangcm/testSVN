package com.tg.IODemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Description: ObjectOutputStreamDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/16
 * @Version: 1.0
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("0405/src/com/tg/IODemo/person.txt"));

        oos.writeObject(new Person("张三", 18));

        oos.close();
    }
}

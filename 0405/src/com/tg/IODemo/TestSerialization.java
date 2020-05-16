package com.tg.IODemo;

import java.io.*;
import java.util.ArrayList;

/**
 * @Description: TestSerialization
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/16
 * @Version: 1.0
 */
public class TestSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("张三", 18));
        personList.add(new Person("李四", 19));
        personList.add(new Person("王五", 20));

        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("0405/src/com/tg/IODemo/person.txt"));

        oos.writeObject(personList);

        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("0405/src/com/tg/IODemo/person.txt"));
        ArrayList<Person> people = (ArrayList<Person>)ois.readObject();

        for (Person person : people) {
            System.out.println(person);
        }

        ois.close();
        oos.close();
    }
}

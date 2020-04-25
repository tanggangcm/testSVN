package com.tg.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Description: IteratorDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/21
 * @Version: 1.0
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("姚明");
        collection.add("科比");
        collection.add("麦迪");
        collection.add("詹姆斯");
        collection.add("艾弗森");

        Iterator<String> iterator = collection.iterator();
        boolean b = iterator.hasNext();
        System.out.println(b);

        System.out.println("------");
        System.out.println(iterator.next());
        System.out.println("======");

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        for (String s : collection) {
            System.out.println(s);
        }
    }
}

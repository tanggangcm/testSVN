package com.tg.IODemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @Description: PropertiesDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/12
 * @Version: 1.0
 */
public class PropertiesDemo {
    public static void main(String[] args) {
//        show01();
//        storeDemo();
        loadDemo();
    }

    private static void loadDemo() {
        Properties properties = new Properties();
        try (FileReader fr = new FileReader("0405/src/com/tg/IODemo/prop.txt")) {
            properties.load(fr);

            Set<String> strings = properties.stringPropertyNames();

            for (String string : strings) {
                System.out.println(string + ":" + properties.getProperty(string));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void storeDemo() {
        Properties properties = new Properties();
        properties.setProperty("A", "45");
        properties.setProperty("AA", "454");
        properties.setProperty("AAA", "4545");

        try (FileWriter fw = new FileWriter("0405/src/com/tg/IODemo/prop.txt")) {
            properties.store(fw, "add data");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void show01() {
        Properties properties = new Properties();
        properties.setProperty("A", "45");
        properties.setProperty("AA", "454");
        properties.setProperty("AAA", "4545");

        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string + ":" + properties.getProperty(string));
        }
    }
}

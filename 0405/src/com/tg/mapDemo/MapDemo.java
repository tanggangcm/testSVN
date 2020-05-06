package com.tg.mapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description: MapDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/29
 * @Version: 1.0
 */
public class MapDemo {
    public static void main(String[] args) {

//        show04();
        /*show03();
        System.out.println("-----------------------");
        show01();
        show02();*/
        test();
    }

    private static void test() {
//        String str = "";
        String str = "gfdsgfsggwtewtafdsfdafdsafdsa";
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if(map.containsKey(aChar)) {
                map.put(aChar, map.get(aChar) + 1);
            } else {
                map.put(aChar, 1);
            }
        }

        System.out.println(map);
    }

    private static void show04() {
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("张三", 12), "123");
        map.put(new Person("张三", 12), "123");

        for (Person person : map.keySet()) {
            System.out.println(person + "-->" + map.get(person));
        }
    }

    private static void show03() {
        Map<String, Integer> map = new HashMap<>();
        map.put("zheshi", 12);
        map.put("ceshi", 132);
        map.put("yige", 13212);
        map.put("keySet", 1234);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "::" + entry.getValue());
        }
    }

    private static void show02() {
        Map<String, Integer> map = new HashMap<>();
        map.put("zheshi", 12);
        map.put("ceshi", 132);
        map.put("yige", 13212);
        map.put("keySet", 1234);

        for (String string : map.keySet()) {
            System.out.println(map.get(string));
        }
    }

    private static void show01() {
        Map<String, String> map = new HashMap<>();
        String put = map.put("zheshi", "ceshi");
        System.out.println(put);
        String put1 = map.put("zheshi", "ceshi1");
        System.out.println(put1);
    }
}

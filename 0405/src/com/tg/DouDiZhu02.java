package com.tg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @Description: DouDiZhu02
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/29
 * @Version: 1.0
 */
public class DouDiZhu02 {
    public static void main(String[] args) {
        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();

        List<String> colors = new ArrayList<>();
        Collections.addAll(colors, "♠","♥","♣","♦");

        List<String> numbers = new ArrayList<>();
        Collections.addAll(numbers, "2","A","K","Q","J","10","9","8","7","6","5","4","3");

        int index = 0;
        poker.put(index, "大王🃏");
        pokerIndex.add(index);

        poker.put(++index, "小王🃏");
        pokerIndex.add(index);

        for (String color : numbers) {
            for (String number : colors) {
                poker.put(++index, color + number);
                pokerIndex.add(index);
            }
        }

        Collections.shuffle(pokerIndex);

        List<Integer> diPai = new ArrayList<>();
        List<Integer> play01 = new ArrayList<>();
        List<Integer> play02 = new ArrayList<>();
        List<Integer> play03 = new ArrayList<>();

        for (Integer integer : pokerIndex) {
            if(integer >= 51) {
                diPai.add(integer);
            } else if(integer % 3 ==0) {
                play01.add(integer);
            } else if(integer % 3 ==1) {
                play02.add(integer);
            } else if(integer % 3 ==2) {
                play03.add(integer);
            }
        }

        Collections.sort(diPai);
        Collections.sort(play01);
        Collections.sort(play02);
        Collections.sort(play03);

        System.out.println("-----------diPai---------");
        for (Integer integer : diPai) {
            System.out.print(poker.get(integer) + " ");
        }
        System.out.println();
        System.out.println("----------play01----------");
        for (Integer integer : play01) {
            System.out.print(poker.get(integer) + " ");
        }
        System.out.println();
        System.out.println("----------play02----------");
        for (Integer integer : play02) {
            System.out.print(poker.get(integer) + " ");
        }
        System.out.println();
        System.out.println("----------play03----------");
        for (Integer integer : play03) {
            System.out.print(poker.get(integer) + " ");
        }
    }
}

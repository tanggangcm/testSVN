package com.tg.red;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Description: Menber
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/10
 * @Version: 1.0
 */
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> list) {
        int index = new Random().nextInt(list.size());
        int delta = list.remove(index);
        int money = super.getMoney();
        super.setMoney(money + delta);
    }
}

package com.tg.red;

import java.util.ArrayList;

/**
 * @Description: MainRedPacket
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/10
 * @Version: 1.0
 */
public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Member memberA = new Member("成员A", 0);
        Member memberB = new Member("成员B", 0);
        Member memberC = new Member("成员C", 0);

        manager.show();
        memberA.show();
        memberB.show();
        memberC.show();

        ArrayList<Integer> send = manager.send(20, 3);
        memberA.receive(send);
        memberB.receive(send);
        memberC.receive(send);

        manager.show();
        memberA.show();
        memberB.show();
        memberC.show();
    }
}

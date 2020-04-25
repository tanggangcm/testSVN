package com.tg;

import java.awt.*;
import java.awt.event.KeyEvent;
/**
 * @Description: Spam 刷屏
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/10
 * @Version: 1.0
 */
public class Spam {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        robot.delay(5000);
        for (int i = 0; i < 200; i++) {
            robot.keyPress(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_I);
            robot.keyPress(KeyEvent.VK_N);
            robot.keyPress(KeyEvent.VK_I);
            robot.delay(10);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.delay(50);
            robot.keyPress(KeyEvent.VK_X);
            robot.keyPress(KeyEvent.VK_I);
            robot.keyPress(KeyEvent.VK_F);
            robot.keyPress(KeyEvent.VK_U);
            robot.keyPress(KeyEvent.VK_E);
            robot.keyPress(KeyEvent.VK_R);
            robot.delay(50);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_ENTER);
        }
    }
}
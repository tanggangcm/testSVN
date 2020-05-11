package com.tg.threadDemo;

/**
 * @Description: Baozi
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/10
 * @Version: 1.0
 */
public class Baozi {
    private String pi;
    private String xian;
    private boolean flag = false;

    public Baozi() {
    }

    public Baozi(String pi, String xian, boolean flag) {
        this.pi = pi;
        this.xian = xian;
        this.flag = flag;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

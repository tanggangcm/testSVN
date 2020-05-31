package com.tg.enumDemo;

/**
 * @Description: EnumDemo
 * @Author: tanggang
 * @Date: 2020/5/30
 * @Version: 1.0
 */
public class EnumDemo {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        System.out.println(spring);
    }
}
enum Season1 {
    //春天
    SPRING("春天", "春天"),
    SUMMER("夏天", "夏天"),
    AUTUMN("秋天", "秋天"),
    WINTER("冬天", "冬天");
    private String seasonName;
    private String seasonDesc;

    Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    public void setSeasonDesc(String seasonDesc) {
        this.seasonDesc = seasonDesc;
    }
}

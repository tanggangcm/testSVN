package com.tg.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

/**
 * @Description: ConstomerCollectorAction
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/9
 * @Version: 1.0
 */
public class ConstomerCollectorAction {
    public static void main(String[] args) {
        Collector<String, List<String>, List<String>> collector = new ToListCollector<>();
        String[] arrs = {"zhehsi", "yige", "shuzu", "labmda", "java8", "string"};
        List<String> result = Arrays.asList("zhehsi", "yige", "shuzu", "labmda", "java8", "string").parallelStream()
                .filter(t -> t.length() > 5).collect(collector);
        System.out.println(result);

    }
}

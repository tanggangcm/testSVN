package com.tg.IODemo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: Test
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/13
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("0405/src/com/tg/IODemo/mistake.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("0405/src/com/tg/IODemo/mistake_copy.txt"));

        String line = "";
        while((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            map.put(arr[0], arr[1]);
        }

        for (String key : map.keySet()) {
            line = key + "." + map.get(key);
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}

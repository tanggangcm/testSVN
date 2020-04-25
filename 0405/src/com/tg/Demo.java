package com.tg;
import java.util.Random;

/**
 * @Description: Demo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/17
 * @Version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        String verificationCode = String.valueOf(new Random().nextInt(899999) + 100000);
        System.out.println(verificationCode);
//        System.out.println(new Date().getTime());
//        String pageSize = null;
//        System.out.println(isBlank(pageSize)?10:null2Int(pageSize));
    }
    public static int null2Int(Object s){
        int v = 0;
        if (s != null)
            try {
                v = Integer.parseInt(s.toString());
            } catch (Exception localException){
            }

        return v;
    }
    public static boolean isBlank(Object...objects){
        Boolean result = false ;
        for (Object object : objects) {
            if(null == object || "".equals(object.toString().trim())
                    || "null".equals(object.toString().trim())){
                result = true ;
                break ;
            }
        }
        return result ;
    }
}


package com.tg;
/**
 * @Description: OutputStreamDemo
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/17
 * @Version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        method01();
//        System.out.println(finallyDemo());
        /*int[] arr = {12,23,34,45};
        System.out.println(arr[-1]);*/
//        String verificationCode = String.valueOf(new Random().nextInt(899999) + 100000);
//        System.out.println(verificationCode);
//        System.out.println(new Date().getTime());
//        String pageSize = null;
//        System.out.println(isBlank(pageSize)?10:null2Int(pageSize));
    }

    private static void method01() {
        System.out.println("method01");
        method02();
    }

    private static void method02() {
        System.out.println("method02");
    }

    public static int finallyDemo() {
        int a = 10;
        try {
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            a = 100;
        }
        return a;
    }
    public static int null2Int(Object s){
        int v = 0;
        if (s != null) {
            try {
                v = Integer.parseInt(s.toString());
            } catch (Exception localException){
            }
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


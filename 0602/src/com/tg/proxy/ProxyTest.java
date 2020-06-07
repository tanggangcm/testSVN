package com.tg.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: ProxyTest
 * @Author: tanggang
 * @Date: 2020/6/6
 * @Version: 1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        Lenove lenove = new Lenove();

        /*
         * 三个参数
         *  1.类加载器 真实对象.getClass().getClassLoader()
         *  2.接口数组 真实对象.getClass().getInterfaces()
         *  3.处理器 new InvocationHandler()
         */
        SaleComputer saleComputer = (SaleComputer)Proxy.newProxyInstance(lenove.getClass().getClassLoader(),
                lenove.getClass().getInterfaces(),
                new InvocationHandler() {
                    /*
                     代理逻辑被编写的方法，代理对象调用的所有方法都会触发该方法执行
                     参数：    1.proxy 代理对象
                              2.method 代理对象调用的方法 ，被封装为的对象
                              3.args 代理对象调用的方法 ，传递的实际参数
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // System.out.println("invoke......");
                        // System.out.println(method.getName());
                        // System.out.println(args[0]);

                        // Object invoke = method.invoke(lenove, args);
                        // return invoke;
                        if("sale".equals(method.getName())) {
                            double money = (double)args[0];
                            money = money * 0.85;
                            String invoke = (String)method.invoke(lenove, money);
                            return invoke + "hahahh";
                        } else {
                            Object invoke = method.invoke(lenove, args);
                            return invoke;
                        }
                    }
                });

        String sale = saleComputer.sale(8000);
        System.out.println(sale);
        saleComputer.show();
    }
}

package com.tg.java8;

/**
 * @Description: NullPointerException
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/2
 * @Version: 1.0
 */
public class NullPointerException {

    /*public static void main(String[] args) {
//        String insuranceName = getInsuranceName(new Person());

        String insuranceNameByDeepDouble = getInsuranceNameByDeepDouble(new Person());
        System.out.println(insuranceNameByDeepDouble);
    }*/

   /* private static String getInsuranceNameByMultExit(Person person) {
        final String defaultValue = "UNKNOWN";
        if(null == person) {
            return defaultValue;
        }
        Car car = person.getCar();
        if(null == car) {
            return defaultValue;
        }
        Insurance insurance = car.getInsurance();
        if(null == insurance) {
            return defaultValue;
        }
        return insurance.getName();
    }

    private static String getInsuranceNameByDeepDouble(Person person) {
        if(null != person) {
            Car car = person.getCar();
            if(null != null) {
                Insurance insurance = car.getInsurance();
                if(null != insurance) {
                    return insurance.getName();
                }
            }
        }
        return "UNKNOWN";
    }

    private static String getInsuranceName(Person person) {
        return person.getCar().getInsurance().getName();
    }*/
}

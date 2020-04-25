package com.tg.java8;

import java.util.Optional;

/**
 * @Description: OptionalInAction
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/2
 * @Version: 1.0
 */
public class OptionalInAction {
    public static void main(String[] args) {
        String insuranceNameByOptional = getInsuranceNameByOptional(null);
        System.out.println(insuranceNameByOptional);

        Optional.ofNullable(getInsuranceNameByOptional(null))
                .ifPresent(System.out::println);
    }

    private static String getInsuranceNameByOptional(Person person) {
        return Optional.ofNullable(person)
                .flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("UNKNOWN");
    }
}

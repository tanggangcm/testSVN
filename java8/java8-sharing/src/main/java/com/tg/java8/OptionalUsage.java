package com.tg.java8;

import java.util.Optional;

/**
 * @Description: OptionalUsage
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/4/2
 * @Version: 1.0
 */
public class OptionalUsage {
    public static void main(String[] args) {
        Optional<Insurance> insuranceOptional = Optional.<Insurance>empty();
//        insuranceOptional.get();

        Optional<Insurance> insuranceOptional1 = Optional.of(new Insurance());
        /*insuranceOptional1.get();

        Optional<Insurance> insuranceOptional2 = Optional.ofNullable(null);
        insuranceOptional2.orElseGet(Insurance::new);

        insuranceOptional2.orElse(new Insurance());

        insuranceOptional2.orElseThrow(RuntimeException::new);

        insuranceOptional2.orElseThrow(() -> new RuntimeException("Not have reference"));*/

        /*Insurance insurance = insuranceOptional.filter(i -> i.getName() != null).get();
        System.out.println(insurance);*/

        /*Optional<String> nameOptional = insuranceOptional1.map(Insurance::getName);
        System.out.println(nameOptional.orElse("empty value"));

        System.out.println(nameOptional.isPresent());*/

        String insuranceName = getInsuranceName(null);
        System.out.println(insuranceName);

        String insuranceNameByOptional = getInsuranceNameByOptional(new Insurance("known"));
        System.out.println(insuranceNameByOptional);
    }

    private static String getInsuranceNameByOptional(Insurance insurance) {
        return Optional.ofNullable(insurance)
                .map(Insurance::getName)
                .orElse("UNKNOWN");
    }

    private static String getInsuranceName(Insurance insurance) {
        if(null == insurance) {
            return "UNKNOWN";
        }
        return insurance.getName();
    }
}

package com.falmeida.tech.method;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Java8MethodReferenceSample1 {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("felix", 38, BigDecimal.valueOf(3800)),
                new Employee("liz", 5, BigDecimal.valueOf(100)),
                new Employee("joe", 25, BigDecimal.valueOf(2500)));

        ComparatorProvider provider = new ComparatorProvider();

        // lambda
        // list.sort((o1, o2) -> provider.compareBySalary(o1, o2));

        // method reference
        list.sort(provider::compareBySalary);

        list.forEach(x -> System.out.println(x.getSalary()));

    }

}

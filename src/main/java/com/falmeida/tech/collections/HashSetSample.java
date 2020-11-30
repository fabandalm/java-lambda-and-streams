package com.falmeida.tech.collections;

import java.util.HashSet;

public class HashSetSample {

    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("BMW");
        System.out.println(cars);
    }

}

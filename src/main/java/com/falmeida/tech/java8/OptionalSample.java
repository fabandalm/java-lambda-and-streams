package com.falmeida.tech.java8;

import java.util.Optional;

public class OptionalSample {

    public static void main(String[] args) {
        Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;

        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        System.out.println("Empty Optional: " + Optional.ofNullable(answer1));
        System.out.println("Empty Optional: " + Optional.ofNullable(answer2));
        System.out.println("Empty Optional: " + Optional.of(answer2));

    }


}

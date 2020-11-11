package com.falmeida.tech;


import java.util.Arrays;

public class LambdaStream {

    public static void main(String[] args) {

        Arrays.asList("red","green","blue").
                stream().
                sorted().
                findFirst().
                ifPresent(System.out::println);
    }

}

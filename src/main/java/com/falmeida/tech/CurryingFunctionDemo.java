package com.falmeida.tech;

import java.util.function.Function;

public class CurryingFunctionDemo {

    public static void main(String args[]) {

        // Using Java 8 Functions
        // to create lambda expressions for functions
        // and with this, applying Function Currying

        // Curried Function for Adding u & v
        Function<Integer, Function<Integer, Integer>> curryAdder = u -> v -> u + v;

        // Calling the curried functions

        // Calling Curried Function for Adding u & v
        System.out.println("Add 2, 3 :" + curryAdder.apply(2).apply(3));

    }
}

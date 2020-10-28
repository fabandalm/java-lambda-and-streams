package com.falmeida.tech;

import java.util.Arrays;
import java.util.function.Consumer;

public class LambdaSample {

    public static void main(String[] args) {

        Consumer<String> consumer = (name) -> System.out.println("Hello " + name);
        for (String name: Arrays.asList("John","Joane","James")){
            consumer.accept(name);
        }

        GreetingFunction greeting = (message) -> System.out.println("Java Programming: " + message);
        greeting.sayMessage("Developer");
    }

}

interface GreetingFunction{
    void sayMessage(String message);
}

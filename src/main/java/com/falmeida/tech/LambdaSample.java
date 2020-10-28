package com.falmeida.tech;

public class LambdaSample {

    public static void main(String[] args) {

        GreetingFunction greeting = (message) -> System.out.println("Java Programming: " + message);
        greeting.sayMessage("Developer");
    }

}

interface GreetingFunction{
    void sayMessage(String message);
}

package com.falmeida.tech.java8;

import java.util.Optional;

public class OptionalSample {

    public static void main(String[] args) {
        Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;

        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println(healthcheck("short"));
        System.out.println(healthcheck("full"));
        System.out.println(healthcheck("xxx"));

    }

    public static String healthcheck(String format){

        if(format.contentEquals("short")){
            return "{\"status\":\"ok\"}";
        }else if (format.contentEquals("full")){
            return String.format("{\"currentTime\":\"x\",\"application\":\"OK\"}");
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

}

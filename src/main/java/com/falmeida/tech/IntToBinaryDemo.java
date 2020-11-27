package com.falmeida.tech;

public class IntToBinaryDemo {


    public static void main(String[] args) {
        IntToBinaryDemo demo = new IntToBinaryDemo();
        String result = demo.convertIntToBinary(10);
        System.out.println(result);
    }

    public String convertIntToBinary(int number){

        StringBuffer binString = new StringBuffer();

        while(number > 0){
            binString.append(number % 2);
            number /=2;
        }

        return binString.reverse().toString();
    }

}

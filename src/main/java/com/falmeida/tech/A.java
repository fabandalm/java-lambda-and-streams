package com.falmeida.tech;

public class A {

    int data = 50; //instance variable
    static int m = 100; //static variable

    void method(){
        int n = 90;//local instance
    }

    public static void main(String[] args) {
        A classA1 = new A();
        A classA2 = new A();
        System.out.println(classA1.data);
        System.out.println(classA2.data);
        classA2.data = 10;
        System.out.println(classA1.data);
        System.out.println(classA2.data);
    }

}

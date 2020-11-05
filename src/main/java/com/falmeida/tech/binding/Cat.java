package com.falmeida.tech.binding;

public class Cat extends Animal{

    void eat(){
        System.out.println("cat is eating...");
    }

    public static void main(String args[]){
        Animal a=new Cat();
        a.eat();
    }

}

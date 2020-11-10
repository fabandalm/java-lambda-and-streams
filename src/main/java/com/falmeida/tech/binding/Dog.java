package com.falmeida.tech.binding;

public class Dog extends Animal{

    void eat(){
        System.out.println("dog is eating...");
    }

    public static void main(String args[]){

        Dog d1=new Dog();
        d1.eat();

        Animal d2 = new Dog();
        d2.eat();

        Animal a1 = new Animal();
        a1.eat();

    }

}

package com.falmeida.tech;

public class KeywordThis {

    void m(){
        System.out.println("Hello m");
    }

    void n(){
        System.out.println("Hello n");
        m();
    }

    public static void main(String[] args) {
        KeywordThis a = new KeywordThis();
        a.n();
    }

}

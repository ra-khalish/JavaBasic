package com.dicoding.javafundamental.casting.example;

public class Kucing extends Hewan {
    String a = "meow";
    @Override
    public void makan() {
        //...
        System.out.println("Ini makan dari kelas kucing");
    }
    public void meow(){
        // ngeong
        System.out.println("Lagi ngeong");
    }

    @Override
    public void kaki() {
        System.out.println("kaki kucing empat");
    }
}

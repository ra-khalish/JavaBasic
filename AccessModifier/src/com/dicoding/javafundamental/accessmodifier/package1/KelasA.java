package com.dicoding.javafundamental.accessmodifier.package1;

public class KelasA {
    private int memberA = 5;

    char memberB = 'A';
    double memberC = 1.5;

    private int functioA(){
        return memberA;
    }

    int functionB(){
        // Pemanggilan private member dan private function
        int hasil = functioA() + memberA;
        return hasil;
    }

    protected void methodC(){
        System.out.println("Percobaan access modifier!!");
    }
}

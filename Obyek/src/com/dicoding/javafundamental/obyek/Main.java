package com.dicoding.javafundamental.obyek;

public class Main {
    public static void main(String[] args){
        // menciptakan object dengan nama 'obyekHewan'
        // Hewan obyekHewan = new Hewan();
        // obyekHewan.cetakNama("Elang");

        Hewan Elang = new Hewan("Elang");
        Hewan Kucing = new Hewan("Kucing");

        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();

        Kucing.beratHewan(2);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();
    }
}

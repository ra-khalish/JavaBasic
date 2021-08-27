package com.dicoding.javafundamental.bangundatar;

import java.util.Scanner;

public class Main {
    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        /*kamus*/
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;

        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();

        /*program*/
        // panggil metode
        mainMenu();

        // kondisional untuk pilihan menu yang dimasukkan
        switch (pilihan){
            case '1':{
                System.out.print("Masukkan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persergi panjang: " +opersegi.luas(s1,s2));
                System.out.println("Keliling persegi panjang: " +opersegi.keliling(s1,s2));
                break;
            }
            case '2':{
                System.out.print("Masukkan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan tinggi segitiga siku: ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga: "+osegitiga.luas(s1,s2));
                System.out.println("Keliling segitiga: " + osegitiga.keliling(s1,s2));
                break;
            }
            case '3':{
                System.out.print("Masukkan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran: "+ olingkaran.luas(r));
                System.out.println("Keliling lingkaran: "+olingkaran.keliling(r));
                break;
            }
            default:{
                System.out.println("Tidak ada pilihan");
                break;
            }
        }
    }

    private static void mainMenu(){
        // pilihan menu
        System.out.println("===============");
        System.out.println("Hitung luas dan keliling : ");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkungan");
        System.out.println("Masukkan menu : ");
        pilihan = scanner.next().charAt(0);
    }

}

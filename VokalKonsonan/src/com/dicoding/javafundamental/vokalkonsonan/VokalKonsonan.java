package com.dicoding.javafundamental.vokalkonsonan;

import java.util.Scanner;

public class VokalKonsonan {
    public static void main(String[] args){
        /* kamus */
        String word = "";
        int vokal = 0;
        int konsonan = 0;

        /*program*/
        // masukan kalimat
        System.out.println("Masukkan kalimat : ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();

        // memanggil prosedur yang mengembalikan nilai int
        vokal = NumVokal(word);
        konsonan = NumKonsonan(word);

        double a = 58.97;
        String hasil = String.valueOf(a);
        System.out.println(hasil);

        System.out.println("Jumlah huruf vokal : " + vokal);
        System.out.println("Jumlah huruf konsonan : " + konsonan);
    }

    private static int NumVokal(String word){
        int i;
        int jumlahVokal = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o') {
                jumlahVokal++;
            }
        }
        return jumlahVokal;
    }

    private static int NumKonsonan(String word) {
        int i;
        int jumlahKonsonan = 0;
        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) != 'a' && word.charAt(i) != 'i' && word.charAt(i) != 'u' && word.charAt(i) != 'e' && word.charAt(i) != 'o') {
                jumlahKonsonan++;
            }
        }
        return jumlahKonsonan;
    }
}

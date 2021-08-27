package com.dicoding.javafundamental.inputoutputstreams.filenavigation;

import java.io.File;

public class Main {
    public static void main(String[] args){
        // Buat directory
//        String dirname = "/home/autopilot/Documents/Belajar/cd/filelatihan1";
//        File file = new File(dirname);
//
//        // Buat directory
//        file.mkdir();

        // Cek isi directory
        String dirname = "/home/autopilot/Documents/Belajar/cd";
        File file = null;
        String[] paths;

        try {
            // Instansiasi objek File
            file = new File(dirname);

            // Ambil list files dan masukkan ke string paths
            paths = file.list();

            // Tampilkan semua path yang ada
            for (String path : paths){
                System.out.println(path);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}

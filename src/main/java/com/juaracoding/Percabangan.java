package com.juaracoding;

public class Percabangan {
    public static void main(String[] args) {
        if(15 < 15){
            System.out.println("Statement");
        }
        System.out.println("Next Statement");

        //program ganjil genap (if else Tunggal)
        int platNomor = 1235;
        if(platNomor % 2 == 0) { // 1 == true
            System.out.println("Plat Nomor Genap");
        } else  {
            System.out.println("Plat Nomor Ganjil");
        }

        //program nilai (if else majemuk)
        int nilai = 90;
        if(nilai >= 90) {
            System.out.println("Predikat A");
        } else if (nilai >= 80) {
            System.out.println("Predikat B");
        } else if (nilai >= 70) {
            System.out.println("Predikat C");
        } else if (nilai >= 60) {
            System.out.println("Predikat D");
        } else {
            System.out.println("Predikat E");
        }

        //login username password, String Object
        String username = "admin123";
        String password = "pass123";
        if(username.equalsIgnoreCase("Admin123") && password.equals("pass123")) { // true and true
            System.out.println("Login Berhasil");
        } else {
            System.out.println("Login Gagal");
        }

    }

}

package com.juaracoding;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        /*if(15 < 15){
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
        }*/

        //nested if
//        Scanner input = new Scanner(System.in);
//        System.out.println("Total Amount: ");
//        int totalAmount = input.nextInt();
//        System.out.println("Total Amount: "+totalAmount);
//        float disc = 0.0f;
//        boolean isMember = true;
//        boolean isFirstTimeBuyer = true;
//        boolean hasCoupon = false;
//        if(totalAmount > 500000) {
//            if (isMember) {
//                disc = 0.1f; //10%
//            }
//            else if (isFirstTimeBuyer) {
//                disc = 0.05f;
//            }
//            else if (hasCoupon){
//                        disc = 0.02f;
//            }
//        }
//        else {
//            System.out.println("Belum Dapat Discount");
//        }
//        System.out.println("Discount: "+disc);
//        System.out.println("Total Payment: "+(totalAmount-totalAmount*disc));

        //switch case (equals)
        //1. Tampilkan data produk
        //2. Input data produk
//        System.out.println("Masukan menu 1-5: ");
//        int menu = input.nextInt();
//        switch (menu){
//            case 1:
//                System.out.println("1. Tampilkan data produk ");
//                break;
//            case 2:
//                System.out.println("2. Input data produk");
//                break;
//            default:
//                System.out.println("Invalid input menu");
//        }

        //operator ternary (hanya 2 result)
        int stock = 1;
        String output = (stock > 0) ? "cukup" : "habis";
        System.out.println("Status Stok Saat ini "+output);

        }
    }

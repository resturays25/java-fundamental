package com.juaracoding;

import org.w3c.dom.ls.LSOutput;

public class MethodJava {
    public static void main(String[] args) {

        //reusable
//        kotak(5);
//        System.out.println("\n");
//        kotak(8);
//        System.out.println(luasKotak(15));
//        System.out.println(luasKotak(20));
//        volumeKotak(20);
//        System.out.println(fullName("Restu", "Ray"));
//        System.out.println(login("admin", "pass123"));
//        detailProduct("Laptop","Dell",5000);
//        double salary = 7000;
//        System.out.println("Pph per Bulan "+pajak(salary));
//        totalSalaryPerYear(salary);
        System.out.println(hasil(6,2));


    }

//    static void kotak(int sisi) {
//        for (int i = 0; i < sisi; i++) {
//            for (int j = 0; j < sisi; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    static int luasKotak(int sisi) {
//        return sisi * sisi;
//    }
//
//    //volumeKotak luasKotak()*sisi;
//    static void volumeKotak(int sisi) {
//        System.out.println(luasKotak(sisi) * sisi);
//    }
//
//    static String fullName(String firstName, String lastName) {
//        return firstName + " " + lastName;
//    }
//
//    static boolean login(String userName, String password) {
//        if (userName.equals("admin") && password.equals("pass123")){
//            return true;
//        }else {
//            return false;
//        }
//    }
//
//    //buatkan sebuah method menampilkan detailProduk (category,productName,price)
//    static void detailProduct (String category, String productName, int price){
//        System.out.println("Kategori: "+category);
//        System.out.println("Nama Produk: "+productName);
//        System.out.println("Harga: "+price);
//    }
    static int hasil (int panjang, int lebar){
        return panjang * lebar;
    }

    //calculateTax() if salary >= 7000 = tax 10% ; salary < 7000 = bukan wajib pajak
    //totalSalaryPerYear()
//    static double pajak(double salary) {
//        if (salary >= 7000) {
//            return salary * 0.1;
//        } else {
//            return salary * 0;
//        }
//    }
//
//    // cara 1: salary * 12 - pajak * 12 ; cara 2: (salary-pajak())*12
//    static double totalSalaryPerYear(double salary) {
//        double total = (salary-pajak(salary))*12;
//        System.out.println("Total Gaji Bersih Per Tahun = " +total);
//    }
}












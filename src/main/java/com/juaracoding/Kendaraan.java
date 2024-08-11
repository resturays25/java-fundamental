package com.juaracoding;

import com.juaracoding.oop.Car;

public class Kendaraan {
    public static void main(String[] args) {
        Car mobil = new Car("Pertalite");
        mobil.warna();
        mobil.mesin();

        System.out.println("Bahan Bakar: "+mobil.getBahanBakar());
        System.out.println("Tahun Pembuatan: "+mobil.getTahunPembuatan());

    }

}
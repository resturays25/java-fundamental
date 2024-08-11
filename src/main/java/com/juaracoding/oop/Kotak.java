package com.juaracoding.oop;

public class Kotak {

    int sisi;

    Kotak(int sisi) {
        this.sisi = sisi;
    }

    void drawKotak() {
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //fungsi luasKotak
    int luasKotak() {
        return sisi * sisi;
    }
}

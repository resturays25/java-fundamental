package com.juaracoding.oop;

public class Segitiga extends BidangDatar {
    //Polymorphism Overriding
    void draw() {
        int sisi = 10; //segitiga siku-siku
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

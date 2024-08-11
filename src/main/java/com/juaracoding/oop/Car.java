package com.juaracoding.oop;

public class Car {
    //state
    String bahanBakar;
    int tahunPembuatan = 2000;

   public Car(String bahanBakar){
        this.bahanBakar = bahanBakar;
    }
    public void warna(){
        System.out.println("Berwarna Merah");
    }
    public void mesin(){
        System.out.println("Bermesin 1800 CC");
    }
    public int getTahunPembuatan(){
        return tahunPembuatan;

    }
    public String getBahanBakar(){
        return bahanBakar;
    }
}
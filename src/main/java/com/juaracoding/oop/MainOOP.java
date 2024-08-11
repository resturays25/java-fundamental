package com.juaracoding.oop;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MainOOP {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getDate());

        Fruit apple = new Fruit();
        apple.grams = 60;
        apple.calsPerGram = 15;
        System.out.println(apple.totalCalories());
        System.out.println(apple); //alamat memori

        Fruit avocado = new Fruit();
        avocado.grams = 220;
        avocado.calsPerGram = 354;
        System.out.println(avocado.totalCalories());
        System.out.println(avocado);

        Kotak kotakSatu = new Kotak(5);
        kotakSatu.drawKotak();
        System.out.println(kotakSatu.luasKotak());

        Kotak kotakDua = new Kotak(10);
        kotakDua.drawKotak();
        System.out.println(kotakDua.luasKotak());

        Car mobil = new Car("Pertalite");
        mobil.warna();
        mobil.mesin();

        System.out.println("Bahan Bakar: "+mobil.getBahanBakar());
        System.out.println("Tahun Pembuatan: "+mobil.getTahunPembuatan());

        Product product1 = new Product("B1","Iron",100000,"Premium","C:\\Users\\User\\Downloads\\logo_baru_peruri.png");
        product1.detailProduct();
        product1.addToCart();

        Product product2 = new Product("B2","Fan",50000,"High","C:\\Users\\User\\Downloads\\logo_baru_peruri.png");
        product2.detailProduct();
        product2.addToCart();

        //menu crud

//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("BMW");
//        cars.add("Tesla");
//        cars.add("Innova");
//        cars.add("Avanza");
//        cars.add("Sedan");
//
//        String[] operations = {"create", "readAll", "readOne", "update", "delete"};
//
//        for (String operation : operations) {
//            switch (operation){
//                case "create":
//                    System.out.println("Tambah Data");
//                    cars.add("Ionic 5");
//                    System.out.println(cars);
//                    break;
//
//                case "readAll":
//                    System.out.println("Tampilkan Semua");
//                    for (String car : cars ) {
//                        System.out.println(car);
//                    }
//                    break;
//
//                case "readOne":
//                    System.out.println("Tampilkan 1 Produk");
//                    int indexToRead = 2;
//                    System.out.println(cars.get(indexToRead));
//                    break;
//
//                case "update":
//                    System.out.println("Ubah Data");
//                    int indexToUpdate = 2;
//                    cars.set(indexToUpdate, "Alphard");
//                    System.out.println(cars.get(indexToUpdate));
//                    break;
//
//                case "delete":
//                    System.out.println("Hapus Data");
//                    int indexToDelete = 3;
//                    cars.remove(indexToDelete);
//                    for (String car : cars){
//                        System.out.println(car);
//                    }

            ArrayList<String> dataProduk = new ArrayList<>();
            Scanner input = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                System.out.println("\nMenu");
                System.out.println("1. Add Product");
                System.out.println("2. Read Product");
                System.out.println("3. Ubah Product");
                System.out.println("4. Hapus Product");
                System.out.println("5. Selesai");
                System.out.println("Pilih Menu: ");

                int choice = input.nextInt();
                input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Tambahkan Data Product: ");
                        String item = input.nextLine();
                        dataProduk.add(item);
                        System.out.println("Add Product Berhasil");
                        break;
                    case 2:
                        System.out.println("\nList Product");
                        for (int i = 0; i < dataProduk.size(); i++) {
                            System.out.println((i + 1) + "." + dataProduk.get(i));
                        }
                        break;
                    case 3:
                        System.out.println("Input Nomor Produk Yang Akan Diupdate: ");
                        int index = input.nextInt() - 1;
                        input.nextLine();

                        if (index >= 0 && index < dataProduk.size()) {
                            System.out.println("Add New Product: ");
                            String newItem = input.nextLine();
                            dataProduk.set(index, newItem);
                            System.out.println("Product Berhasil Diupdate");
                        } else {
                            System.out.println("Nomor Product Tidak Valid");
                        }
                        break;
                    case 4:
                        System.out.println("Input Nomor Product Yang Akan di Hapus:");
                        index = input.nextInt() - 1;
                        input.nextLine();

                        if (index >= 0 && index < dataProduk.size()) {
                            dataProduk.remove(index);
                            System.out.println("Product Berhasil Dihapus");
                        } else {
                            System.out.println("Nomor Product Tidak Valid");
                        }
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Pilihan Tidak Valid");
                }
            }
        System.out.println("Program Selesai");
    }
}

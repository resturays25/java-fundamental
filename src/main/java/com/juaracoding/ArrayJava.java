package com.juaracoding;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayJava {
    public static void main(String[] args) {
//        int [] nilai = {71,72,73,74,75};
//        System.out.println(nilai[2]);
//        System.out.println(nilai.length);
//        for (int i = 0 ; i < nilai.length ; i++){
//            System.out.println(nilai[i]);
//        }
        //cara 2
        int[] grades = new int[5];
        grades[0] = 86;
        grades[1] = 87;
        grades[2] = 88;
        grades[3] = 89;
        grades[4] = 90;
        grades[2] = 91;

        //for i
        int amountGrades = grades.length;
        for (int i = 0; i < amountGrades; i++) {
            System.out.println(grades[i]);
        }

        //foreach
//        for(double grade : grades){
//            System.out.println(grade);
//            System.out.printf("%.2f\n",grade);
//        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for(String car : cars){
//            System.out.println(car.toUpperCase());
//        }

        //Array Multidimensi, baris dan kolom
//        int [][] number = {{1,2,3,4},{5,6,7}};
//        int rowIndex = 0;
//        int columnIndex = 3;
//        System.out.println(number[1][2]);
//        System.out.println(number[rowIndex][columnIndex]);
//
//        for(int i = 0; i < number.length; i++) { //row length
//            for (int j = 0; j < number[i].length; j++) { //column length
//                System.out.println(number[i][j]); //awal: number[0][0]
//            }
//            System.out.println();
//        }
//
//        //buatkan input (Scanner) 5 data array price
//        //jumlahkan semua data price
//
        Scanner input = new Scanner(System.in);
//        System.out.println("Masukan jumlah data: ");
//        int dataLength = input.nextInt();
//        int[] price = new int[dataLength];
//        for (int i = 0; i < price.length; i++){
//            System.out.println("Masukan harga ke-"+(i+1)+":");
//            price[i] = input.nextInt();
//        }

        //assignment value
        //totalPrice += price // totalPrice = 0 + 30000

        //search
        //cari salah satu data mobil gunakan array
        //if(search equals cars[i]) break
        boolean isFound = false;
        System.out.println("Cari mobil: ");
        String search = input.next();
        for (int j = 0; j < cars.length; j++) {
            if (search.equalsIgnoreCase(cars[j])) {
                isFound = true;
                break;
            }

        }
        if (isFound) {
            System.out.println("Data ditemukan");
        } else {
            System.out.println("Data tidak ditemukan");
        }

        // Cara sorting 2
    // Mengurutkan array
        Arrays.sort(cars);

    // Menampilkan hasil pengurutan
        for (String car : cars) {
            System.out.println(car);
        }


    }


}

package com.juaracoding;

public class Operator {
    public static void main(String[] args) {
        int modulus = 5 % 2;
        System.out.println(modulus);

        int x = 2;
        int num1 = 10 * x++; //suffix
        System.out.println("Hasil Suffix = "+num1);

        int y = 2;
        int num2 = 10 * ++y; //prefix
        System.out.println("Hasil Prefix = "+num2);

        int result = 10 + 2 * 6 / 3;
        System.out.println(result);

        int result1 = (10 + 2) * 6 / 3;
        System.out.println(result1);

        //assignment
        int a = 10;
        a += 5; //a = a + 5
        System.out.println(a);

        //relational
        int b = 15;
        System.out.println(a == b); //15 == 15
        System.out.println(a < b); // 15 < 15

        //bitwise AND,OR,XOR,NOT,Left shift,Right shift
        int c = 10;
        int d = 12;
        System.out.println(c & d);


    }
}

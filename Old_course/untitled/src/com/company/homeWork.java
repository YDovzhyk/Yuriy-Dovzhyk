package com.company;

public class homeWork {
    public static void main (String[] args) {
        int a = 4685;
        int b = a%100;
        int d = a / 100;
        System.out.println(b+d);

        int ad = (a / 100)*10 +a%10;
        int bc = (a / 10)%1000;
        b = ad + bc;
        System.out.println(b);

        int a = 8;
        float b = 12.3f;
        int c = Math.abs(a - 10);
        float d = Math.abs(b - 10);
        if (c>d) {
            System.out.println("a blizhe k 10");
        } else {
            if (d>c){
            System.out.println("b blizhe k 10");
        } else {
                System.out.println("a ravno удалено от И");
            }


            int a = 5

    }
}
package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 4685;
        int b = a % 100;
        int d = a / 100;
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        int ad = (a / 1000) * 10 + a % 10;
        int bc = (a / 10) % 100;
        b = ad + bc;
        System.out.println(ad);
        System.out.println(bc);
    }
}

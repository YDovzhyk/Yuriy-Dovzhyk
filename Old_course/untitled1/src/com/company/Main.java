package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("введите число месяца");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        System.out.println("введите число месяца");
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();

        System.out.println("следующий день: " + a);
        System.out.println("следующий день: " + a);

        int v = 0;
        if (a == 1 && b == 2){
            v = a + b;
//            System.out.println("OK" + a);
//            System.out.println("OK" + v);
        }
        int d = v + 10;
        System.out.println( + d);
    }
}

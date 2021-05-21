package com.company;

// Определить заканчивается ли число на 7

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("введите число");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();

        for (int i = 10; i <= 10; i = i * 10) {
            if (a % i == 7){
                System.out.println("число заканчивается на 7");
            } else {
                System.out.println("число не заканчивается на 7");
            }
        }
    }
}

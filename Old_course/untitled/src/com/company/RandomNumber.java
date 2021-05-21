package com.company;

import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) throws Exception {

        int i1 = (int) (Math.random() * 100);

        System.out.println("Input Number");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();



        System.out.println("Your choice: " + number);

        if (i1 == number) {
            System.out.println("You are right");

        } else {
            if (i1 > number) {
                System.out.println("The number must be greater");
                System.out.println("Input Number again");

            } else {
                System.out.println("The number must be less");
                System.out.println("Input Number again");
            }
        }
    }
}
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
    int result = (int) (Math.random() * 100);
    randomNumber(result);
    }
    public static void randomNumber(int result) {
    System.out.println("Введите ваш вариант числа");

    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    System.out.println("Вы ввели: " + number);
    }


}

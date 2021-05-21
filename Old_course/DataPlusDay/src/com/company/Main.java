package com.company;

import java.util.Scanner;
import java.time.LocalDate;
// Напишите программу расчета даты следующего дня введя 3 числа - день месяц и год

class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("введите число месяца");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        System.out.println("введите номер месяца");
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner1.nextInt();
        System.out.println("введите год");
        Scanner scanner3 = new Scanner(System.in);
        int c = scanner3.nextInt();

        if (a <= 0 | b > 12 | c < 0){
            System.out.print("Ошибка введения данных");
        } else {
            LocalDate date = LocalDate.of(c, b, a);
            date = date.plusDays(1);
            int year = date.getYear();
            int month = date.getMonthValue();
            int dayOfMonth = date.getDayOfMonth();

            System.out.printf("%d %d %d \n", dayOfMonth, month, year);
        }
// введите число месяца
//31
//введите номер месяца
//12
//введите год
//2020
//1.1.2021
    }
}

package com.company;

import javax.swing.*;
import java.sql.SQLOutput;
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
        float c = scanner3.nextInt();


        float g = (c / 4 * 1461); // переводим года в дни

        float s = c / 4;                // Определяем высокосный год или нет
        float k = Math.round(s) - s;    // Определяем высокосный год или нет

        int v = 0; // определяем к-во дней введенного месяца
        if (b == 1){
            v = 0;
        } else if (b == 2){
            v = 31;
        } else if (b == 3 && k > 0){
            v = 59;
        } else if (b == 3 && k == 0){
            v = 60;
        } else if (b == 4 && k > 0){
            v = 90;
        } else if (b == 4 && k == 0) {
            v = 91;
        } else if (b == 5 && k > 0) {
            v = 120;
        } else if (b == 5 && k == 0) {
            v = 121;
        }else if (b == 6 && k > 0) {
            v = 151;
        } else if (b == 6 && k == 0) {
            v = 152;
        } else if (b == 7 && k > 0) {
            v = 181;
        } else if (b == 7 && k == 0) {
            v = 182;
        } else if (b == 8 && k > 0) {
            v = 212;
        } else if (b == 8 && k == 0) {
            v = 213;
        } else if (b == 9 && k > 0) {
            v = 243;
        } else if (b == 9 && k == 0) {
            v = 244;
        } else if (b == 10 && k > 0) {
            v = 272;
        } else if (b == 10 && k == 0) {
            v = 273;
        } else if (b == 11 && k > 0) {
            v = 305;
        } else if (b == 11 && k == 0) {
            v = 305;
        } else if (b == 12 && k > 0) {
            v = 334;
        } else if (b == 12 && k == 0) {
            v = 335;
        } else if (b > 12) {
            System.out.println("Такой месяц не существует!");
        }
        int h = v + a + 1;

        int d = 0; int m = 0; float y = 0;
        if (h > 366 && k==0) {
            d = 1; m = 1; y = c + 1;
        } else if (h > 365 && k > 0) {
            int d = 1; int m = 1; float y = c + 1;
        } else if (h <= 31) {
            d = h; m = 1; y = c;
        } else if (h > 31 && h <= 59 && k > 0)

                System.out.println("колличество дней новой даты : " + h);
                System.out.println("колличество дней новой даты : " + k);
                System.out.println("новая дата : " + d + " " + m + " " + y);



//        System.out.println("следующий день: " + s);
//        System.out.println("следующий день: " + k);
        }

    }


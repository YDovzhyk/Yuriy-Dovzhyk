package com.company;
import java.util.Scanner;
import java.math.MathContext;

public class Main {

    public static void main(String[] args) {

        System.out.println("Выберите номер задания:");
        System.out.println("1. Вывести последню цифру числа");
        System.out.println("2. Сумма и произведение цифр трехзначного числа");
        System.out.println("3. Вывести длину отрезка, проходящей через две точки");
        System.out.println("4. Найти сумму цифр ab + cd числа abcd");
        System.out.println("5. Вывести 3юю цифру 5ти-значного числа");
        System.out.println("6. Как с помощью побитовой операции привести int в byte?");
        System.out.println("7. используя логические операторы, выведите на экран:\n" +
                "- меньше ли 100 числа, введенные с клавиатуры\n" +
                "- является ли число, введенное с клавиатуры, больше 15, но меньше 75\n" +
                "- является ли число, введенное с клавиатуры, больше 61, но меньше 19");
        System.out.println();
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        if (a < 1 || a > 7) {
            System.out.println("Перезапустите программу для выбора задания");
        } else ;
        taskNumber(a);
    }

    public static void taskNumber(int a) {

        if (a == 1) {
            System.out.println("Введите число:");
            Scanner scanner2 = new Scanner(System.in);
            int b = scanner2.nextInt();

            int lasCharacter = b % 10;
            System.out.println("Последняя цифра числа = " + lasCharacter);// Последняя цифра числа
        }
        if (a == 2) {
            System.out.println("Введите трехзначное число:");
            Scanner scanner3 = new Scanner(System.in);
            int с = scanner3.nextInt();

            if (с > 100 && с < 1000) {
                int Sum = (с % 10) + ((с / 10) % 10) + ((с / 100) % 10);
                System.out.println("Сумма чисел трехзначного числа = " + Sum); // Сумма чисел трехзанчного числа
                int Prod = (с % 10) * ((с / 10) % 10) * ((с / 100) % 10);
                System.out.println("Произведение чисел трехзначного числа = " + Prod); //
            } else {
                System.out.println("Число не трехзначное, для выполнения задания 2 введите трехзначное число");
            }
        }
        if (a == 3) {
            System.out.println("Введите координаты X первой точки");
            Scanner scanner4 = new Scanner(System.in);
            double d = scanner4.nextInt();
            System.out.println("Введите координаты Y первой точки");
            Scanner scanner5 = new Scanner(System.in);
            double e = scanner5.nextInt();
            System.out.println("Введите координаты X второй точки");
            Scanner scanner6 = new Scanner(System.in);
            double f = scanner6.nextInt();
            System.out.println("Введите координаты Y второй точки");
            Scanner scanner7 = new Scanner(System.in);
            double g = scanner7.nextInt();

            double l = (f - d) * (f - d) + (g - e) * (g - e);
            System.out.println("Длина линии = " + Math.sqrt(l));
        }
        if (a == 4) {
            System.out.println("Введите четырехзначное число");
            Scanner scanner8 = new Scanner(System.in);
            int k = scanner8.nextInt();

            if (k >= 1000 && k <= 10000) {
                int first = k / 1000 % 10;
                int second = k / 100 % 10;
                int third = k / 10 % 10;
                int fourth = k % 10;
                int sum1 = first + second;
                int sum2 = third + fourth;
                System.out.println("Сумма первых двух чисел = " + sum1);
                System.out.println("Сумма вторых двух чисел = " + sum2);
            } else ;
            System.out.println("Число не четырехзначное, для выполнения задания 4 введите четырехзначное число");
        }
        if (a == 5) {
            System.out.println("Введите пятизначное число");
            Scanner scanner9 = new Scanner(System.in);
            int m = scanner9.nextInt();

            if (m >= 10000 && m <= 100000) {
                int thirdNumber = m / 100 % 10;
                System.out.println("3яя цифра пятизначного числа = " + thirdNumber);
            } else ;
            System.out.println("Число не пятизначное, для выполнения задания 5 введите пятизначное число");
        }
        if (a == 6) {
            System.out.println("Введите число");
            Scanner scanner10 = new Scanner(System.in);
            int n = scanner10.nextInt();
            int f = ~n;
            System.out.println("Представление числа: " + n + " в двоичной системе исчисления: " + Integer.toBinaryString(n));
            System.out.println("Побитовый оператор NOT ~" + f + " в двоичной системе исчисления: " + Integer.toBinaryString(f));
        }
        if (a==7) {
            System.out.println("Введите число");
            Scanner scanner11 = new Scanner(System.in);
            int o = scanner11.nextInt();
            if (o < 100) {
                System.out.println("Введенное число меньше 100");
            } else {
                System.out.println("Число равно 100 или больше");
            }
            if (o > 15 && o < 75) {
                System.out.println("Введенное число больше 15 и меньше 75");
            } else {
                System.out.println("Введенное число меньше 15 или больше 75");
            }
            if (o > 61) {
                System.out.println("Введенное число больше 61 и не может быть меньше 19");
            } if (o < 19) {
                System.out.println("Введенное чмсло меньше 19 и не можнт быть больше 61");
            } if (o > 18 && o < 62) {
                System.out.println("Введенное число находится между 19 и 61 - не удовлетворяет условиям");
            }
        }
    }
}
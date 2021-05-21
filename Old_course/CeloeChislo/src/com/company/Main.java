package com.company;

import java.util.Scanner;

// Для введенного целого числа определить является ли это число простым.
// программа, проверят число на простоту числа. Известно, что число является простым в том случае, если оно целое положительное и без остатка делится на себя и на 1.

class Main {

    public static void main(String[] args) throws Exception {
        boolean isPrime=true;
        int temp;
        System.out.println("Введите число");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();


        for (int i=2; i > 0; i++)
            temp = a % i;
            if (temp == 0) {
                System.out.println(temp);
                isPrime = false;
                break
            }
        }
        // если переменная isPrime равна true, то число простое
        if(isPrime) {
            System.out.println(a + " - простое число");
        } else {
            System.out.println(a + " - составное число");
        }

    }
}
package com.company;

import java.util.Scanner;

// Для введенного целого числа определить является ли это число простым.
// программа, проверят число на простоту числа. Известно, что число является простым в том случае, если оно целое положительное и без остатка делится на себя и на 1.

class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Введите число");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();

        int i;
        boolean isComposite = false;
        for (i = 2; i != a; i++) {
            if (a % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (isComposite) {
            System.out.println("число составное ");
        } else {
            System.out.println("число  простое ");
        }
    }
}



package com.company;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

// 
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int i;
        int j;
        int g;
        int l = 0;
        int index = 0;
        int count = 0;
        int nums = 0;
        int f = 0;


        for (j = 1; j <= k; j = j * 10) {
            for (i = 120; i <= k; i++) {
                for (l = i; l > 0; l = l / 10) {
                    g = l % j;

                    do {
                        nums=g;
                        if (nums == 2)
                            index=nums;
                        if (i == i)
                            f = i;
                     } while (k == 0);

                }
                if (index == 2)
                    count++;
                if (f != (i-1))
                    index = 0;
            }

        }
        System.out.println("число: " + count);

    }

}









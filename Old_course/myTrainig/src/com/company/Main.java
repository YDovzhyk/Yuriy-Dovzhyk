package com.company;

import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        for (int m = 2; m <= 100; a = a + 1) {
            System.out.println(+ pow(m, a));
        }
    }
}

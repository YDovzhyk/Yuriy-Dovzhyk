package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Введите число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        a %= 7; // Unexpected token

        if (a == 1) {
            System.out.println("Понедельник");
        } else if (a == 2) {
            System.out.println("Вторник");
        } else if (a == 3) {
            System.out.println("Среда");
        } else if (a == 4) {
            System.out.println("Четверг");
        } else if (a == 5) {
            System.out.println("Пятница");
        } else if (a == 6) {
            System.out.println("Суббота");
        } else if (a == 7) {
            System.out.println("Воскрееснье");
        }
}

}
package com.company;

import java.util.Scanner;
// Имеется прямоугольное отверстие размера a на b.
// Определить можно ли полностью закрыть отверстие круглой картонкой радиусом r

class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Введите ширину прямогугольника");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        System.out.println("Введите длину прямоугольника");
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner1.nextInt();
        System.out.println("Введите радиус круга");
        Scanner scanner3 = new Scanner(System.in);
        int c = scanner3.nextInt();
        double x1 = a * a;
        double x2 = b * b;
        double x = x1 + x2;
        double y = Math.sqrt(x);{
            System.out.println("Половина диаметра прямоугольника: " + y/2);
        }
        if (c >= y/2) {
            System.out.println("Да, круг перекроет прямоугольник");
        } else {
            System.out.println("Нет, круг не перкроет прямоугольник");
        }
    }
}


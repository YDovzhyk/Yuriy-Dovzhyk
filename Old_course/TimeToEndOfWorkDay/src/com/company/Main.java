package com.company;

import java.util.Scanner;

// На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
//оставшихся до конца рабочего дня. Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
//далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна выводиться фраза
//о количестве полных часов, содержащихся в n секундах.

class Main {

    public static void main(String[] args) throws Exception {

//        System.out.println("введите число секунд из [0;28800]");
//        Scanner scanner1 = new Scanner(System.in);
//        float a = scanner1.nextInt();
        float a = (int) (Math.random() * 28800);

        int b = Math.round(a);
        System.out.println("Осталось секунд: " + b);

        float h = a / 3600; // Определяем к-во часов
        if (h == 0) {
            System.out.println("Рабочий день закончился");
        } else if (h <= 0.9 && h > 0) {
            System.out.println("Осталось менее часа");
        } else if (h >= 1 && h < 1.9) {
            System.out.println("Остался 1 час");
        } else if (h >= 2 && h < 2.9) {
            System.out.println("Осталось 2 часа");
        } else if (h >= 3 && h < 3.9) {
            System.out.println("Осталось 3 часа");
        } else if (h >= 4 && h < 4.9) {
            System.out.println("Осталось 4 часа");
        } else if (h >= 5 && h < 5.9) {
            System.out.println("Осталось 5 часов");
        } else if (h >= 6 && h < 6.9) {
            System.out.println("Осталось 6 часов");
        } else if (h >= 7 && h < 7.9) {
            System.out.println("Осталось 7 часов");
        } else if (h == 8) {
            System.out.println("Начало рабочего дня");
        } else if (h > 8) {
            System.out.println("Рабочий день не начался");
        }
    }
}

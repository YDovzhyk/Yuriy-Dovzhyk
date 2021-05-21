package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Введите номер задания для выполнения");
        System.out.println("____________________________________");
        System.out.println("1) Необходимо вывести на экран числа от 5 до 1 \n" +
                "На экране должно быть: 5 4 3 2 1");
        System.out.println("2) Необходимо вывести на экран таблицу умножения на 5");
        System.out.println("3) Необходимо, чтоб программа выводила на экран вот такую последовательность: \n" +
                "7 14 21 28 35 42 49 56 63 70 77 84 91 98");
        System.out.println("4) Необходимо вывести на консоль такую последовательность чисел:\n" +
                "1 2 4 8 16 32 64 128 256 512");
        System.out.println("5) Создайте программу, выводящую на экран первые 15 элементов последовательности 3 9 27 81 243");
        System.out.println("6) Выведите на экран все простые числа меньше 100");
        System.out.println("7) Необходимо написать программу, которая бы вывела в консоль звездочки вот таким образом, как на картинке ниже\n" +
                "* * * * *\n" + "* * * * *\n" + "* * * * *\n");
        System.out.println("8) Необходимо написать программу, которая бы вывела в консоль звездочки вот таким образом, как на картинке ниже\n" +
                "*\n" + "* *\n" + "* * *\n" + "* * * *\n" + "* * * * *\n");
        System.out.println("9) Посчитайте четные и нечетные цифры числа, введенного с клавиатуры");
        System.out.println("10) Найдите сумму и произведение цифр числа, введенного с клавиатуры");
        System.out.println("11) Найдите самую большую цифру числа, введенного с клавиатуры, а также ее индекс");
        System.out.println("____________________________________");
        Scanner scanner1 = new Scanner(System.in);
        int s = scanner1.nextInt();
        if (s < 1 || s > 11) {
            System.out.println("Перезапустите программу для выбора задания");
        } else ;
        taskNumber(s);
    }

    public static void taskNumber(int s) {

        if (s == 1) {
            int y;
            for (int x = 6; x < 11; x++) {
                y = 11 - x;
                System.out.print(y + " ");
            }
        }
        if (s == 2) {
            for (int a = 1; a < 11; a++) {

                System.out.println(a + " * 5" + " = " + a * 5);
            }
        }
        if (s == 3)
            for (int b = 1; b < 15; b++) {
                System.out.print(b * 7 + " ");
            }
        if (s == 4)
            for (int c = 1; c < 513; c = c + c) {
                System.out.print(c + " ");
            }
        if (s == 5)
            for (int e = 3; e < Math.pow(3, 16); e = e + e + e) {
                System.out.print(e + " ");
            }
        if (s == 6) {
            int k;
            int l;
            for (l = 1; l < 100; l++) {

                boolean isComposite = false;
                for (k = 2; k != l; k++) {
                    if (l % k == 0) {
                        isComposite = true;
                        break;
                    }
                }
                if (isComposite) {
//                System.out.println("число составное ");
                } else {
                    System.out.println("число  простое " + k);
                }
            }
        }
        if (s == 7) {
            int i;
            int j;

            for (i = 1; i < 10; i++) {

                while (i < 4) {
                    for (j = 1; j < 6; j++)
                        System.out.print("* ");
                    System.out.println("");
                    break;
                }
            }
        }
        if (s == 8) {
            int i;
            int j;

            for (i = 1; i < 10; i++) {
                while (i < 6) {
                    for (j = 1; j < i + 1; j++)
                        System.out.print("* ");
                    System.out.println("");
                    break;
                }
            }
        }
        if (s == 9) {
            System.out.println("Введите число");
            Scanner scanner = new Scanner(System.in);
            int k = scanner.nextInt();

            int i;
            int count1= 0;
            int count2= 0;
            for (i = 1; i <= k; i++)
                while (i % 2 > 0) {
                    count1++;
                    break;
                }
            for (i = 1; i <= k; i++)
                while (i % 2 == 0) {
                    count2++;
                    break;
                }
            System.out.println("Колличество не четных чисел: " + count1);
            System.out.println("Колличество четных чисел: " + count2);
        }
        if (s == 10) {
            System.out.println("Введите число");
            Scanner scanner = new Scanner(System.in);
            int h = scanner.nextInt();

            int i;
            int j;
            int y;
            int sum = 0;
            int count = 1;
            for (i = 1; i <= h; i = i * 10) {
            }
            for (j = 10; j <= i; j = j * 10) {
                for (h = h; h > 0; h = h / 10) {
                    y = h % j;
                    sum += y;
                    count *= y;
                }
            }
            System.out.println("Сумма чисел введенного числа: " + sum);
            System.out.println("Произведение чисел введенного числа: " + count);
        }
        if (s == 11) {
            System.out.println("Введите число");
            Scanner scanner = new Scanner(System.in);
            int k = scanner.nextInt();

            int i;
            int j;
            int g;
            int l = 0;
            int index = 1;
            int count = 0;
            int nums = 0;
            int largest = Integer.MIN_VALUE;

            if (k < 0)
                k = k * (-1);

            for (i = 1; i <= k; i = i * 10) {

            }
            if (i == 10 || k == 0)
                largest = k;

            else ;

            for (j = 10; j <= k; j = j * 10) {
                for (k = k; k > 0; k = k / 10) {
                    g = k % j;
                    count++;
                    do {
                        nums = g;
                        if (nums > largest)
                            largest = nums;
                        if (g == largest)
                            l = count;
                        index = count - l + 1;
                    } while (k == 0);
                }
            }
            System.out.println("Максимальное число: " + largest);
            System.out.println("Индекс числа: " + index);
        }

    }
}
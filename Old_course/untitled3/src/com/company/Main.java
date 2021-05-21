package com.company;

// Электронные часы показывают время в формате от 00:00 до 23:59.
//Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
//что справа от двоеточия (например, 02:20, 11:11 или 15:51)

public class Main {

    public static void main(String[] args) throws Exception {

        int i;
        int j;
        int n;
        int c = 0;

        for (j = 0; j <= 59; j++) {
            i = (j % 10) * 10 + ((j / 10) % 10); // Отзеркаливам минуты
            {
//                System.out.println(i);
            }
            for (n = 0; n <= 24; n++)
            {
//                System.out.println(n);
                if (i == n) {
                    c++;
                }
            }
        }
        System.out.println("число комбинаций: " + c);
    }
}
// число комбинаций: 17


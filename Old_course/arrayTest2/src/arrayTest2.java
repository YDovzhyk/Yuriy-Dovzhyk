import java.util.*;
import java.util.stream.Collectors;
import java.util.Iterator;

public class arrayTest2 {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Введите номер задания для выполнения");
        System.out.println("____________________________________");
        System.out.println("1) Найти сумму элементов многомерного массива");
        System.out.println("2) Заполнить многомерный массив случайными цифрами");
        System.out.println("3) Найти сумму элементов столбцов матрицы многомерного массива)");
        System.out.println("4) Найти строку матрицы с максимальной суммой элементов");
        System.out.println("5) Сделать транспонирование матрицы (замена строк на столбцы)");
        System.out.println("6) Найти минимальный элемент матрицы (двумерного массива) ниже побочной диагонали");

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
            int[][] array = {
                    {1, 2, 3, 4},
                    {11, 8, 13, 14},
                    {7, 6, 15, 19},
            };


            int sum = 0;
            int comp = 1;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                    comp *= array[i][j];
                }
            }
            System.out.println("Sum: " + sum);
            System.out.println("Composition: " + comp);
        }
        if (s == 2) {
            int[][] array = new int[4][];
            array[0] = new int[4];
            array[1] = new int[4];
            array[2] = new int[4];
            array[3] = new int[4];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = (int) (Math.random() * 10 + 10);
                }
            }
            for (int i = 0; i < array.length; i++, System.out.println()) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");

                }
            }
//            System.out.println(Arrays.deepToString(array)); //[[3, 8, 8], [5, 8, 0, 0, 1, 4, 8], [1, 5, 4, 3, 5], [8, 7, 0, 0, 3, 1, 3]]
        }
        if (s == 3) {
            int[][] array = new int[4][];
            array[0] = new int[4];
            array[1] = new int[4];
            array[2] = new int[4];
            array[3] = new int[4];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = (int) (Math.random() * 10);
                }
            }
            for (int i = 0; i < array.length; i++, System.out.println()) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            }
            int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;

            for (int i = 0; i < array.length; i++) {
                sum1 += array[i][0];
                sum2 += array[i][1];
                sum3 += array[i][2];
                sum4 += array[i][3];
            }

            System.out.println("Сумма цифр первого столбика: " + sum1);
            System.out.println("Сумма цифр вторго столбика: " + sum2);
            System.out.println("Сумма терьего столбика: " + sum3);
            System.out.println("Сумма четвертого столбика: " + sum4);
        }
        if (s == 4) {
            int[][] array = new int[4][];
            array[0] = new int[4];
            array[1] = new int[4];
            array[2] = new int[4];
            array[3] = new int[4];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = (int) (Math.random() * 10);
                }
            }
            System.out.println("Многомерный массив");
            for (int i = 0; i < array.length; i++, System.out.println()) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            }
            int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
            for (int i = 0; i < array.length; i++) {
                sum1 += array[0][i];
                sum2 += array[1][i];
                sum3 += array[2][i];
                sum4 += array[3][i];
            }
            int[] sumArray = {sum1, sum2, sum3, sum4};
            int max = sumArray[0];
            for (int g = 1; g < sumArray.length; g++) {
                if (sumArray[g] > max) {
                    max = sumArray[g];
                }
            }
            int num = 0;
            for (int k = 0; k < sumArray.length; k++) {
                if (sumArray[k] == max) {
                    num = k + 1;
                }
            }
            System.out.println("Максимальная сумма строки элементов: " + max);
            System.out.println("Строка: " + num);
        }
        if (s == 5) {
            int[][] array = new int[4][];
            array[0] = new int[4];
            array[1] = new int[4];
            array[2] = new int[4];
            array[3] = new int[4];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = (int) (Math.random() * 10);
                }
            }
            System.out.println("Многомерный массив");
            for (int i = 0; i < array.length; i++, System.out.println()) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            }
            for (int f = 0; f < array.length; f++) { // Переворачиваем изначальный массив
                for (int h = f + 1; h < array[f].length; h++) {
                    int temp = array[f][h];
                    array[f][h] = array[h][f];
                    array[h][f] = temp;
                }
            }
            System.out.println("Перевернутый массив");
            for (int f = 0; f < array.length; f++, System.out.println()) {
                for (int h = 0; h < array[f].length; h++) {
                    System.out.print(array[f][h] + " ");
                }
            }
        }
        if (s == 6) {
            int[][] array = new int[4][];
            array[0] = new int[4];
            array[1] = new int[4];
            array[2] = new int[4];
            array[3] = new int[4];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = (int) (Math.random() * 10 + 10);
                }
            }
            System.out.println("Многомерный массив");
            for (int i = 0; i < array.length; i++, System.out.println("  ")) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            }
            int min = array[0][3];
            int k = 0;
                for (int i = 0; i < array.length; i++) {
                    k++;
                    for (int j = array.length - k; j < array.length; j++) {
                        if (array[j][i] <= min) {
                            min = array[j][i];
                        }
                    }
                }
            System.out.println();
            System.out.println("Диагональ справа" + " от " + array[0][3] + " до " + array[3][0]);
            System.out.println("Минимальный элемент: " + min);
        }
    }
}








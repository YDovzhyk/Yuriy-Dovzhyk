
import java.util.*;
import java.util.stream.Collectors;
import java.util.Iterator;

public class arrayTest {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Введите номер задания для выполнения");
        System.out.println("____________________________________");
        System.out.println("1) Найти максимальное и минимальное значение из массива");
        System.out.println("2) Вставить элемент в указанное место массива");
        System.out.println("3) Поместить нули в конец массива");
        System.out.println("4) Найти максимальный из элементов массива с четными индексами \n" +
                "Найти минмальный из элементов массива с нечетными индексами");
        System.out.println("5) Удалить отрицательные элементы массива");
        System.out.println("6) Удалить отрицательные элементы массива (ArrayList)");
        System.out.println("7) Найти сумму цифр массива");
        System.out.println("8) Разложить положительные и отрицательные числа по разным массивам");
        System.out.println("9) Найти к-во уникальных элементов массива");
        System.out.println("10) Определить, какое число в массиве встречается чаще всего");
        System.out.println("11) Выполнить слияние 2 упорядоченных массивов");

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
            int[] array = new int[12];
            for (int i = 0; i < array.length; i++) {
                array[i] = ((int) (Math.random() * 12) + 10);
            }
            System.out.println(Arrays.toString(array));

            int max = array[0];
            int min = array[0];
            for (int j = 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                }
                if (array[j] <= min) {
                    min = array[j];
                }
            }

            System.out.println("Max. element: " + max);
            System.out.println("Min. element: " + min);
        }
        if (s == 2) {
            System.out.println("Введите index элемента который нужно заменить (от 0 до 9)");
            Scanner scanner2 = new Scanner(System.in);
            int g = scanner2.nextInt();
            System.out.println("Введите новый элемент");
            Scanner scanner3 = new Scanner(System.in);
            int m = scanner3.nextInt();

            int[] mylist = new int[10];
            for (int i = 0; i < mylist.length; i++) {
                mylist[i] = ((int) (Math.random() * 12) + 10);
            }
            System.out.println(Arrays.toString(mylist));

            mylist[g] = m;
            String result = String.valueOf(mylist[g]);
            {
                System.out.println(Arrays.toString(mylist)); // Вставить элемент в указанное место массива
            }
        }
        if (s == 3) {
            System.out.println("Введите количество элементов, которые должны быть заменены 0");
            Scanner scanner4 = new Scanner(System.in);
            int g = scanner4.nextInt();

            int[] mylist1 = new int[10];
            for (int i = 0; i < mylist1.length; i++) {
                mylist1[i] = ((int) (Math.random() * 12) + 10);
            }
            System.out.println(Arrays.toString(mylist1));

            for (int j = 0; j < mylist1.length; j++)
                if (j > mylist1.length - (g + 1)) {
                    mylist1[j] = 0;
                }
            System.out.println(Arrays.toString(mylist1)); // Поместить нули в конец массива
        }
        if (s == 4) {
            int[] mylist2 = new int[12];
            for (int i = 0; i < mylist2.length; i++) {
                mylist2[i] = ((int) (Math.random() * 12) + 10);
            }
            System.out.println(Arrays.toString(mylist2));
            System.out.println();

            int max = mylist2[0];
            int min = mylist2[0];
            int index;

            for (int j = 0; j < mylist2.length; j++) {
                index = j;
                if (mylist2[j] > max & index % 2 == 0) {
                    max = mylist2[j];
                }
                if (mylist2[j] <= min & index % 2 == 1) {
                    min = mylist2[j];
                }
            }
            System.out.println("Max. element: " + max);
            System.out.println("Min. element: " + min);
        }
        if (s == 5) {
            int array = 12;
            int[] mylist3 = new int[array];
            int nElems = 0;

            for (int i = 0; i < mylist3.length; i++) {
                mylist3[i] = (int) (Math.random() * array - 6);
            }
            System.out.println(Arrays.toString(mylist3));
            System.out.println("_______________________");

            int[] copyArrayMy = new int[mylist3.length]; // Копируем массив в новый массив и определеям к-во отрицательных чисел в массиве
            System.arraycopy(mylist3, 0, copyArrayMy, 0, mylist3.length);
            for (int g = 0; g < copyArrayMy.length; g++) {
                if (copyArrayMy[g] < 0) {
                    nElems++;
                }
            }
            for (int j = 0; j < mylist3.length; j++) {
                if (mylist3[j] < 0) {

                    for (int k = j; k < mylist3.length - 1; k++) { // Если в массиве встречается отрицательное число мы заменяем его следующим и сдвигаем все элементы в лево
                        mylist3[k] = mylist3[k + 1];
                    }
                    for (int t = 0; t < mylist3.length; t++) {
                        if (mylist3[t] < 0) {

                            for (int o = t; o < mylist3.length - 1; o++) { // Повторно проверяе массив и если встречается отрицательное число повторяем опреацию со сдвигом
                                mylist3[o] = mylist3[o + 1];
                            }
                        }
                    }
                }
            }
            int[] destArr = new int[mylist3.length - nElems]; // Перезаписываем полученный массив уменьшая его размер на колличество отрицательных чисел
            System.arraycopy(mylist3, 0, destArr, 0, mylist3.length - nElems);
            for (int i = 0; i < destArr.length; i++) ;
            System.out.println(Arrays.toString(destArr));
        }
        if (s == 6) {
            int array = 12;
            int[] mylist3 = new int[array];

            for (int i = 0; i < mylist3.length; i++) {
                mylist3[i] = (int) (Math.random() * array - 6);
            }
            System.out.println(Arrays.toString(mylist3));
            System.out.println("_______________________");

            List<Integer> intList = new ArrayList<Integer>();
            for (int i : mylist3) {
                intList.add(i);
            }
            Iterator<Integer> iterator = intList.iterator();

            while (iterator.hasNext()) {
                Integer next = iterator.next();
                if (next < 0) {
                    iterator.remove();
                }
            }
            System.out.println(intList);
        }
        if (s == 7) {
            int array = 12;
            int[] mylist3 = new int[array];
            int sum = 0;

            for (int i = 0; i < mylist3.length; i++) {
                mylist3[i] = (int) (Math.random() * array - 6);
            }
            System.out.println(Arrays.toString(mylist3));
            System.out.println("_______________________");

            for (int j = 0; j < mylist3.length; j++) {
                sum += mylist3[j];
            }
            System.out.println("Сумма элементов массива: " + sum);
        }
        if (s == 8) {
            int array = 12;
            int[] mylist3 = new int[array];

            for (int i = 0; i < mylist3.length; i++) {
                mylist3[i] = (int) (Math.random() * array - 6);
            }
            System.out.println(Arrays.toString(mylist3));
            System.out.println("_______________________");

            int[] destArr = new int[mylist3.length];
            System.arraycopy(mylist3, 0, destArr, 0, mylist3.length);
            for (int j = 0; j < destArr.length; j++) ;

            List<Integer> intList = new ArrayList<Integer>();
            for (int i : mylist3) {
                intList.add(i);
            }
            Iterator<Integer> negativeIterator = intList.iterator();

            while (negativeIterator.hasNext()) {
                Integer next = negativeIterator.next();
                if (next > 0 || next == 0) {
                    negativeIterator.remove();
                }
            }
            System.out.println(intList);

            List<Integer> intPosList = new ArrayList<Integer>();
            for (int j : destArr) {
                intPosList.add(j);
            }
            Iterator<Integer> positiveIterator = intPosList.iterator();

            while (positiveIterator.hasNext()) {
                Integer next = positiveIterator.next();
                if (next <= 0) {
                    positiveIterator.remove();
                }
            }
            System.out.println(intPosList);
        }
        if (s == 9) {
            int array = 12;
            int[] mylist3 = new int[array];
            int count = 0;

            for (int i = 0; i < mylist3.length; i++) {
                mylist3[i] = (int) (Math.random() * array - 6);
            }
            System.out.println(Arrays.toString(mylist3));
            System.out.println("_______________________");

            for (int i = 0; i < mylist3.length; i++) {
                for (int j = i + 1; j < mylist3.length; j++) {
                    if (mylist3[j] == mylist3[i]) {
                        count++;
                        break;
                    }
                }
            }
            System.out.println("К-во уникальных элементов массива: " + count);
        }
        if (s == 10) {
            int array = 12;
            int[] mylist3 = new int[array];

            for (int i = 0; i < mylist3.length; i++) {
                mylist3[i] = (int) (Math.random() * array - 6);
            }
            System.out.println(Arrays.toString(mylist3));
            System.out.println("_______________________");

            int[] result = new int[mylist3.length]; // Создаем новый массив с числом повторений чисел из основного массива
            for (int i = 0; i < mylist3.length; i++) {
                int c = 0;
                for (int j = 0; j < mylist3.length; j++) {
                    if (j < i && mylist3[i] == mylist3[j])
                        break;
                    if (mylist3[i] == mylist3[j])
                        c++;
                    if (j == mylist3.length - 1) {
                        result[i] = c;
                    }
                }
            }
            int maxCount = result[0]; // Определеям из массива result наибольшее колличесво повторений
            for (int i = 0; i < result.length; i++) {
                if (maxCount < result[i]) {
                    maxCount = result[i];
                }
            }
            int indexMaxCount = 0; // Определеям из массива result index числа с наибольшим повторением
            for (int j = 0; j < result.length; j++) {
                if (result[j] == maxCount) {
                    indexMaxCount = j;
                }
            }
            int number = 0; // Определяем число из первоначального массива с наибольшим числом повторений
            for (int k = 0; k < mylist3.length; k++) {
                if (k == indexMaxCount) {
                    number = mylist3[k];
                }
            }
//            System.out.println(Arrays.toString(result));
            System.out.println("Наибольшее к-во повторений: " + maxCount);
            System.out.println("Index числа с наибольшим повторением: " + indexMaxCount);
            System.out.println("Первое число с наибольшим числом повторений: " + number);
        }
        if (s == 11) {
            int array1 = 5;
            int array2 = 5;
            int[] mylist3 = new int[array1];
            int[] myList4 = new int[array2];

            for (int i = 0; i < mylist3.length; i++) {
                mylist3[i] = (int) (Math.random() * array1);
            }
            for (int j = 0; j < myList4.length; j++) {
                myList4[j] = (int) (Math.random() * array2 - 4);
            }
            System.out.println(Arrays.toString(mylist3));
            System.out.println(Arrays.toString(myList4));
            System.out.println("_______________________");

            int w = 0, v = 0, k = 0, l = 0;

            for (w = 0; w < mylist3.length; w++) {
                int maxIndex = w;
                for (v = w; v < mylist3.length; v++) {
                    if (mylist3[maxIndex] < mylist3[v]) {
                        maxIndex = v;
                    }
                }
                int temp = mylist3[maxIndex];
                mylist3[maxIndex] = mylist3[w];
                mylist3[w] = temp;
            }
            for (k = 0; k < myList4.length; k++) {
                int maxIndex1 = k;
                for (l = k; l < myList4.length; l++) {
                    if (myList4[maxIndex1] < myList4[l]) {
                        maxIndex1 = l;
                    }
                }
                int temp1 = myList4[maxIndex1];
                myList4[maxIndex1] = myList4[k];
                myList4[k] = temp1;
            }
            int[] splitArray = new int[mylist3.length + myList4.length];
            int p = 0;

                for (int g = 0; g < mylist3.length; g++) { //Получаю ошибку g
                        for (int h = 0; h < myList4.length; h++) {
                            do {
                                if (mylist3[g] > myList4[h]) {
                                    splitArray[p++] = mylist3[g++];
                                } else {
                                    splitArray[p++] = myList4[h++];
                                }
                            } while (h < myList4.length);
                        }
                }

            System.out.println(Arrays.toString(mylist3));
            System.out.println(Arrays.toString(myList4));
            System.out.println(Arrays.toString(splitArray));
        }
    }
}















































import java.util.Arrays;
//1. Создайте массив из 8 случайных целых чисел из отрезка [1;10]
//2. Выведите массив на экран в строку
//3. Замените каждый элемент с нечётным индексом на ноль
//4. Снова выведете массив на экран на отдельной строке
public class ArraysTest {
    public static void main(String[] args) {
            int [] mas = new int[8];

            for (int i = 0; i < mas.length; i++) {
//                for (int i : mas){
                mas[i] = (int)(Math.random()*10)+1;
            }
            System.out.println(Arrays.toString(mas));
            for (int i = 0; i < mas.length; i++) {
                if(i%2 == 1){
                    mas[i] = 0;
                }
            }
            System.out.println(Arrays.toString(mas));
        }
    }
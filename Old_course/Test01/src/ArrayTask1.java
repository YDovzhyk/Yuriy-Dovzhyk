import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTask1 {

    public static void main(String[] args) {
        int[] array = {1, -3, 4, -9, 3, 4, 70, -10, 0, 7};
        System.out.println(Arrays.toString(array));
        System.out.println("________________");

        int k = 3; //на сколько сдвинем влево

        for (int i = 0; i < k; i++) {
        int tmp = array[0];
        for (int j = 0; j < array.length - 1; j++)
            array[j] = array[j+1];
        array[array.length - 1] = tmp;
    }
System.out.println(Arrays.toString(array));
    }
}


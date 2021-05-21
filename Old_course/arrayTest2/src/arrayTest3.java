import java.util.*;
import java.util.stream.Collectors;
import java.util.Iterator;

public class arrayTest3 {
    public static void main(String[] args) {
        int[][] array = {
                {27, 10, 19, 22},
                {18, 10, 12, 22},
                {7, 13, 8, 23},
                {9, 12, 15, 16},
        };
        int k = 0;
        int min = array[0][3];
        for (int i = 0; i < array.length; i++) {
                k++;
                for (int j = array.length - k; j < array.length; j++) {
                    if (array[j][i] <= min) {
                        min = array[j][i];
                    }
                }
        }
            System.out.println(min);
            System.out.println(k);

        }
    }


package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

        int[] myList = new int[5];
        for (int i = 0; i < 5; i++) {
            myList[i] = (int) (Math.random() * 100 + 1);


            int maxList = myList[0];
            int indexOfMax = 0;
            for (int j = 0; j < myList.length; j++) {
                if (maxList < myList[j]) {
                    maxList = myList[j];
                    indexOfMax = j;
                }
            }
            System.out.println("максимальное значение :" + maxList + "  " + "индекс в массиве :" + indexOfMax);
        }
    }
//            System.out.println(i + "  " + myList[i]);
}



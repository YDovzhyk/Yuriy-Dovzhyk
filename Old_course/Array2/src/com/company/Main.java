package com.company;

public class Main {

    public static void main(String[] args) {
	int [][] myList = {
            {1, 3, 5, 6, 7, 9},
            {2, 3, 4, 5, 6, 7, 8},
            {5, 3, 2, 1, 6, 8,}
        };
        for (int[] a : myList) {
            for (int b : a) {
                System.out.print(b + " ");
            }

        }
        System.out.println();
        int sum = 0;
        for(int i = 0; i < myList.length; i++) {
            for(int j = 0; j < myList[i].length; j++) {
                sum+= myList[i][j];
            }
        }
        System.out.println("Sum: " + sum);
    }
    }

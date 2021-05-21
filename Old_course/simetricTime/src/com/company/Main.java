package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        int i;
        int j;
        int n;
        int counter = 0;
        for (j = 24; j <= 25; j++) {
            i = (j % 10) * 10 + ((j / 10) % 10);
            System.out.println(i);
        }
        for (n = 26; n <= 27; n++) {
            System.out.println(n);
        }
        if (i/n==1){
            System.out.println("yes");
        }
    }
}




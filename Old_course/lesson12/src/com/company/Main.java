package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	int n =15;
	int [][][] a = new int[n][n][n];
	for (int i=0; i< n; i++){
	    for (int j=0; j<n; j++){
	        for (int k=0; k<n; k++){
	            a[i][k][j]=i*13+j%5-k*2;
            }
        }
    }
//        System.out.println(a[7][2][11]);
    }
}

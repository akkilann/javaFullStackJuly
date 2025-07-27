package com.java.basics;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] twoD = new int[row][col];

        //iterate using regular for loop
        System.out.println("Enter array input :: ");
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[0].length; j++){
                twoD[i][j] = sc.nextInt();
            }
        }

        //Print array values
        System.out.println("Print Array data");
        for (int[] rowD : twoD) {
            for(int value : rowD){
                System.out.print(value + " ");
            }
            System.out.println();
        }

        //Print square root of each no
        System.out.println("Print Sq.rt Array data");
        for (int[] rowD : twoD) {
            for(int value : rowD){
                System.out.print(Math.sqrt(value) + " ");
            }
            System.out.println();
        }
    }
}

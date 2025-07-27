package com.training.basic;

import java.util.Scanner;

public class TwoDimArray {
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
        //Print even nos ::
        System.out.println("Print Even Nos of Array data");
        int sum = 0;
        for (int[] rowD : twoD) {
            for(int value : rowD){
                if(value % 2 == 0 ) {
                    sum +=value;
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
        System.out.println("Sum of Even nos in 2D Array :: "+sum);
    }
}

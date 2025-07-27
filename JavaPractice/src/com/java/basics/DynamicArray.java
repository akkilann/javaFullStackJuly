package com.training.basic;

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        int[][] twoD = new int[3][];
        twoD[0]=new int[3];
        twoD[1]=new int[2];
        twoD[2]=new int[4];

        //Scanner sc = new Scanner(System.in);
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter array data");
            for (int i = 0; i < twoD.length; i++) {
                // System.out.println("Enter value for row :"+ i);
                for (int j = 0; j < twoD[i].length; j++) {
                    System.out.println("Enter value for col :[" + i + "][" + j + "]");
                    twoD[i][j] = sc.nextInt();
                }
            }

            //Print array values
            System.out.println("array data :: ");
            for (int[] rowD : twoD) {
                for (int value : rowD) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }catch (Exception e){
            System.out.println("Exception occured"+e.getMessage());
        }
    }
}

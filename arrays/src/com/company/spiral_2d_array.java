package com.company;

import java.util.Scanner;

public class spiral_2d_array {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int r_start = 0;
        int r_end = row-1;
        int c_start = 0;
        int c_end = col-1;
        while(r_start<=r_end && c_start<=c_end){
            for (int i = 0; i <col ; i++) {
                System.out.print(arr[r_start][i]+" ");
            }
            r_start++;
            for (int i = 0; i < row ; i++) {
                System.out.print(arr[i][c_end]+" ");
            }
            c_end--;
            for (int i = c_end;i>=0;i--){
                System.out.print(arr[r_end][i]+" ");
            }
            r_end--;
            for (int i = r_end;i>=0;i--){
                System.out.print(arr[i][c_start]+" ");
            }
            c_start++;
            System.out.println();
        }
    }
}

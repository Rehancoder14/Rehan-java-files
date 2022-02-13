package com.company;
import java.util.Scanner;
public class multidimension_array {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[2][3];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println("\n");
        System.out.println(arr[0][2]);
    }

}

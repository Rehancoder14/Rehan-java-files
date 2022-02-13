package com.company;
import java.util.Scanner;
public class array2dprob1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter columns: ");
        int t = sc.nextInt();
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        int arr[][] = new int[t][n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i <t ; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <t ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        for (int i = 0; i <t ; i++) {
            for (int j = 0; j < n; j++) {
                if(key==arr[i][j]){
                    System.out.println("The key is present at the index ("+i+","+j+")");
                }
            }
        }


    }
}

package com.company;

import java.util.Scanner;

public class issorted {
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean isAscending = true;
        int arr[] = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <t-1 ; i++) {
            if(arr[i]>arr[i+1]){
                isAscending = false;
            }
        }
        if(isAscending){
            System.out.println("Array is sorted in ascending order");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
}

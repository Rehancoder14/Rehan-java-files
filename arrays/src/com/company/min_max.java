package com.company;
import java.util.Scanner;
public class min_max {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[t];

        for (int i = 0; i <t ; i++) {
            arr[i] = sc.nextInt();
        }
        int min =arr[0];
        for (int i = 0; i < t; i++) {
            if (min>arr[i]){
                min = arr[i];
            }
        }

        System.out.println("The minimum of array is "+min);
        int max=arr[0];
        for (int i = 0; i < t; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The maximum of array is "+max);
    }
}

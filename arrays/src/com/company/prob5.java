package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class prob5 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The largest element in array is "+max);
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min>arr[i]){
                min= arr[i];
            }
        }
        System.out.println("The smallest element in the array is "+min);
    }
}

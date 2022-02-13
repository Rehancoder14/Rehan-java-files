package com.company;
import java.util.Scanner;
public class insertion_sort {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the string");

        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        insertion sort

        for(int i=0;i<n-1;i++){
            for(int j= i+1; j<n;j++){
                if (arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("The Sorted array in the ascending order is ");
        for (int i = 0; i<n; i++){
            System.out.print(+arr[i]+" ");
        }


    }

}

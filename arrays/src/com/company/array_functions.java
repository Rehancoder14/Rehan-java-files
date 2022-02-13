package com.company;

public class array_functions {
    public static void main( String[] args){
        int arr[]={12,432,4,5,3,3,2,53};
        System.out.println(arr.length);
        for(int i =arr.length-1; i>=0;i--){
            System.out.print(arr[i]+ " ");
        }

        for (int element : arr) {
            System.out.println(element);
        }
    }
}

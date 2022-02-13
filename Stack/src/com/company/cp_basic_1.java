package com.company;

public class cp_basic_1 {
    public static void main(String[]args){
        int arr[] ={1,2,3,4,5,6};
        int temp;
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }



    }
}

package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class boolcheck {
    public static boolean isAscending(int arr[],int t){
        int nums[] = new int[t];
        boolean flag = false;
        for (int i = 0; i < t; i++) {
            nums[i] = arr[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i <t ; i++) {
            if(nums[i]==arr[i]){
                flag = true;
            }
            else{
                flag = false;
            }
        }
        if(flag==true){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[t];
        for (int i = 0; i <t ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isAscending(arr,t));
    }
}

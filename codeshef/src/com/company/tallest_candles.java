package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class tallest_candles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int max_val=0;
        for (int i = 0; i <n ; i++) {
            if(arr[n-1] == arr[i]){
                max_val = max_val+1;
            }
        }
        System.out.println(max_val);
    }
}

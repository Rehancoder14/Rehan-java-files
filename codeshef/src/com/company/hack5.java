package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class hack5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min_val=0, max_val=0;
        for (int i = 0; i < 4; i++) {
            min_val = min_val+arr[i];
        }
        for (int i = 4; i>=0; i--) {
            max_val = max_val+arr[i];
        }
        System.out.println(min_val+" "+max_val);
    }
}

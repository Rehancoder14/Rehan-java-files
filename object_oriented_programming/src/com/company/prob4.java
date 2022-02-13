package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class prob4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int arr[] =  new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int res = arr[0]+arr[1];
            System.out.println(res);
        }
    }
}

package com.company;
import java.util.Scanner;
public class hack3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        int des = 0;
        int arr[][] = new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i; j++) {
                if(i==j){
                    res = res+arr[i][j];
                }
                if (i == n - j - 1){
                    des = des+arr[i][j];
                }
            }
        }
        System.out.println(res+" "+des);


    }
}

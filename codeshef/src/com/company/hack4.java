package com.company;
import java.util.Scanner;
public class hack4 {
    public static void main(String[]args){
        Scanner sc =new Scanner (System.in);
        int n = sc.nextInt();
        double arr[] = new double[n];
        double ans[] = {};
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        for (int i = 0; i <n ; i++) {
            if (arr[i]>0){
                double t = arr[i]/n;
                ans[i] = t;
            }
        }
        for (int i = 0; i < ans.length ; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}

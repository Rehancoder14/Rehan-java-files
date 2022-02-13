package com.company;
import java.util.Scanner;
public class sum_in_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            int [][]arr=new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <=i ; j++) {
                    arr[i][j] = sc.nextInt();
                }

            }
            int k = n-2;
            while (k>=0){
                for (int i = 0; i <=k; i++) {
                    arr[k][i]+= Math.max(arr[k+1][i],arr[k+1][i+1]);
                }
                k--;
            }
            System.out.println(arr[0][0]);
            }


        }
    }


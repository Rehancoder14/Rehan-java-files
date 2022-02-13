package com.company;
import java.util.Scanner;
import java.io.*;
import java.lang.Math.*;
public class sting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        for(int i=0; i<q;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            for(int j=0;j<n;j++)
            {
                a+=(Math.pow(2,j)*b);
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}


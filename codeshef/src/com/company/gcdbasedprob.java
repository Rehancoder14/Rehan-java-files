package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class gcdbasedprob {
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    // Function to find gcd of array of
    // numbers
    public static int findGCD(int arr[], int n)
    {
        int result = 0;
        for (int element: arr){
            result = gcd(result, element);
            if(result == 1)
            {
                return 1;
            }
        }
        return result;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            int []b=new int[a];
            int []c=new int[a];
            for (int j=0;j<a;j++){
                b[j]= sc.nextInt();
                c[j]=b[j];
            }

            int result=b[0];
            for (int j=1;j<a;j++){
                result=(findGCD(b,b.length));
            }
            for (int j=0;j<a;j++){
                //  System.out.println(b[0]);
                System.out.print(b[j]/result+" ");

            }
            System.out.println();
        }

    }
}

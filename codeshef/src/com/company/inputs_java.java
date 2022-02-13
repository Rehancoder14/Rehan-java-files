package com.company;
import java.util.Scanner;
public class inputs_java {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            int a = sc.nextInt();
            int[] b = new int[a];
            int[] c = new int[a];
            for (int j = 0; j < a; j++) {
                b[j] = sc.nextInt();
                c[j] = b[j];
            }
        }
    }

}

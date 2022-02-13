package com.company;

import java.util.Scanner;

public class expn {
    public static void find(int n, int t,int p){
        double power = Math.pow(n,t);
        double ans = power%p;
        System.out.println( String.format("%.0f", ans));

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int p = sc.nextInt();
        find(n,t,p);
    }
}

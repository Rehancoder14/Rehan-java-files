package com.company;

import java.util.Scanner;

public class getgcd {
    public static int get_gcd(int x, int y){
        int gcd=1;
        for (int i = 1; i <=x && i<=y ; i++) {
            if(x%i==0  && y%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int  x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println((x*y)/get_gcd(x,y));
    }
}

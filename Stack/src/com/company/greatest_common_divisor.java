package com.company;

public class greatest_common_divisor {
    public static void main(String[]args) {
        int x = 50;
        int y = 60;
        int gcd = 1;
        for (int i = 1; i <=x &&i<=y; i++) {
            if(x%i==0 && y%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}

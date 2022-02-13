package com.company;

import java.util.Scanner;

public class fact1_easy {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i <t ; i++) {
            int num = sc.nextInt();
            int zeroes = 0;
            int c= 5;


            while(num/c >0){
                zeroes= zeroes+ (num/c);
                c = c*5;
            }

            System.out.println(zeroes);
        }

    }
}

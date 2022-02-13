package com.company;
import java.util.Scanner;
public class prob1 {
    static void into(int num){
        for (int i = 1; i < 11; i++) {
            System.out.println(num+" x "+i+" = "+ num*i);
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        into(n);

    }
}

package com.company;
import java.util.Scanner;
public class factorial {
    public static void main(String[]args){
        System.out.println("*******Factorial******");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}

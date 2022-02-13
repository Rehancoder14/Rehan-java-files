package com.company;
import java.util.Scanner;
public class prob2 {
    static void stars(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main( String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        stars(num);

    }
}

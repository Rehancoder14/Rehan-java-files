package com.company;
import java.util.Scanner;
public class prob4 {
    static void patter(int n){
        for (int i = n; i >=1; i--) {
            for (int j = i; j >=1; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        patter(num);
    }
}

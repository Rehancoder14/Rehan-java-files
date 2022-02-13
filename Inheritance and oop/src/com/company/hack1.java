package com.company;
import java.util.Scanner;
public class hack1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float t = sc.nextFloat();
        sc.nextLine();
        String str2 = sc.nextLine();
        String str1 = "HackerRank ";
        int r = Math.round(t);

        System.out.println(n+r);
        System.out.println(t+t);
        System.out.print(str1);
        System.out.print(str2);
    }
}

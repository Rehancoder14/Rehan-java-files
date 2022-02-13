package com.company;
import java.util.Scanner;
public class example {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double t = sc.nextDouble();
        String str2;
        str2 = sc.nextLine();
        String str1 = "HackerRank ";

        int tot = (int) t;
        System.out.println(n+tot);
        System.out.println(t+t);
        System.out.print(str1);
        System.out.print(str2);
    }
}

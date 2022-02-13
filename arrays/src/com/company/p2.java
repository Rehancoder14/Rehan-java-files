package com.company;
import java.util.Scanner;
public class p2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String names[] = new String[t];
        for (int i = 0; i <t; i++) {
            names[i] = sc.next();
        }
        for (int i = 0; i <t ; i++) {
            System.out.print(names[i]+" ");
        }
    }
}

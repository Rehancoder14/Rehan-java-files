package com.company;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int rem =0;
        int revnum = 0;

        while(n>0){
            rem = n%10;
            revnum = revnum*10 +rem;
            n = n/10;

        }
        if (num==revnum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}

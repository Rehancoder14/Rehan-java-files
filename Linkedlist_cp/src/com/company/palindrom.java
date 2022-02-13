package com.company;

import java.util.Scanner;

public class palindrom {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int revnum = 0;
        int rem = 0;
        int num = n;
        while(num!=0){
            rem = num%10;
            revnum = revnum*10 +rem;
            num = num/10;
        }
        if(n ==revnum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

}

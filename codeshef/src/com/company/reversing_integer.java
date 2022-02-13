package com.company;

import java.util.Scanner;

public class reversing_integer {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem = 0;
        int revnum = 0;
        while(num>0){
            rem = num%10;
            revnum = (revnum*10)+rem;
            num = num/10;
        }
        System.out.println(revnum);
    }
}

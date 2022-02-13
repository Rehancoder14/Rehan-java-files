package com.company;
import java.util.Scanner;
public class prime_number {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int  revnum = 0; int rem=0;
        int n = num;
        while(num>0){
            rem = num%10;
            revnum = (revnum*10)+rem;
            num = num/10;
        }
        System.out.println(revnum);

    }
}

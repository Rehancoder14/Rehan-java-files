package com.company;
import java.util.Scanner;
public class sum_of_digit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        int rem = 0;
        int sum = 0;
        while(t!=0){
            rem = t%10;
            sum +=rem;
            t = t/10;
        }
        System.out.println(sum);
    }
}

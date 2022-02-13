package com.company;
import java.util.Scanner;
public class whileloop {
    public static void main(String[]args){
        int sum = 0;
//        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many even number should be sum");
        int n = 4;
        for (int i = 0; i < n; i++) {
            sum = sum + (2*i);
        }
        System.out.print("The sum of n even number is "+ sum);
    }
}

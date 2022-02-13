package com.company;
import java.util.Scanner;
public class prob3 {
    static int sum(int n){
        if(n!=0){
            return n+sum(n-1);
        }
        else{
            return n;
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
}

package com.company;
import java.util.Scanner;
public class printprime {
    public static boolean isprime(int n){
        if(n<2){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 1; i <= t; i++) {
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
}

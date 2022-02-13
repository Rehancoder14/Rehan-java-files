package com.company;
import java.util.Scanner;
public class recursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    static int factorial_iter(int n){
        if(n==0 || n==1){
            return 1;

        }
        else{
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact*i;
            }
            return fact;
        }
    }
    static int fib(int n){
        if (n<2){
            return n;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        System.out.println(factorial(num));
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println(factorial_iter(num2));
        System.out.print(fib(num));
    }
}

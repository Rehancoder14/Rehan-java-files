package com.company;

public class factorial_while {
    public static void main(String[]args){
        System.out.println("*****Factorial using While loop********");
        int num = 5;
        int i  = 1;
        int factorial = 1;
        while (i<=num){
            factorial *= i;
            i++;
        }
        System.out.println(factorial);

    }
}

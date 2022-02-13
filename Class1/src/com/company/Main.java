package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num 2: ");
        int num2 = sc.nextInt();
        System.out.print("The sum of the numbers is "+(num1+num2));
    }
}

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1= s.nextInt();
        System.out.print("Enter num2: ");
        int num2 = s.nextInt();
        System.out.print("Enter num3: ");
        int num3 = s.nextInt();
        System.out.print("The sum of three number is : "+ (num1+num2+num3));
    }
}

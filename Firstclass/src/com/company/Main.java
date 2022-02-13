package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        byte m1 = sc.nextByte();
        byte m2 = sc.nextByte();
        byte m3 = sc.nextByte();
        byte m4 = sc.nextByte();
        byte m5 = sc.nextByte();
        float percent = ((m1+m2+m3+m4+m5)/5);
        System.out.println("The percentage is "+percent);
    }
}

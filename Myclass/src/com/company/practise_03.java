package com.company;
import java.util.Scanner;
public class practise_03 {
    public static void main(String[] args) {
        int givennum = 10;
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter number");
        int number = ab.nextInt();
        System.out.println(givennum < number );
    }
}

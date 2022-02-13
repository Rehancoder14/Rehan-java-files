package com.company;
import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        switch (age){
            case 18:
                System.out.println("You are going to be an adult.");
                break;
            case 28:
                System.out.println("you are going to be 28.");
                break;
            default:
                System.out.println("Veterinian");

        }
    }
}

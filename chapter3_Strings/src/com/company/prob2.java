package com.company;
import java.util.Scanner;
public class prob2 {
    public static void main(String[]args){
        String letter = "Dear name,  Thanks a lot.";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println(letter.replace("name",name));
        System.out.println(letter.indexOf("  "));
    }
}

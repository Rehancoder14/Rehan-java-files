package com.company;

import java.util.Scanner;

public class stringcomparison {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String name1 =sc.nextLine();
        String name2 = sc.nextLine();
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal...");
        }
        else{
            System.out.println("Strings are not equal...");
        }
    }
}

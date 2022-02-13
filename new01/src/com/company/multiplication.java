package com.company;
import java.util.Scanner;
public class multiplication {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int n = s.nextInt();
        for (int i = 1; i <11 ; i++) {
            System.out.println(n+" x "+i+" = "+ n*i);
        }

//        prob2
        System.out.println("Enter num");
        int a = s.nextInt();
        for (int i = 10; i >=1 ; i--) {
            System.out.println(a + " x " + i + " = " + a * i);
        }
    }

}

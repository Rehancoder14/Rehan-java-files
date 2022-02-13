package com.company;
import java.util.Scanner;
import java.util.Random;
public class random_num {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        System.out.println("Enter your num: ");
        int user_num= sc.nextInt(),ran_num = rand.nextInt(10);


        while (ran_num!=user_num){
            System.out.println("Enter your number: ");
            user_num = sc.nextInt();
        }
        System.out.println("Well guessed");
    }
}

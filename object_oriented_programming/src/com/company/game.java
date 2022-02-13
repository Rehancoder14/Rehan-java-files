package com.company;
import java.util.Scanner;
import java.util.Random;
public class game {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rock(0),Paper(1) or scissor(2)");
        int usernum  = sc.nextInt();

        Random ran = new Random();
        int compnum = ran.nextInt(3);


        if(compnum==usernum){
            System.out.println("Draw");
        }
        else if(compnum>usernum){
            System.out.println("Computer win");
        }
        else{
            System.out.println("user win");
        }
        // **************************************************************************************************
        if (compnum==0){
            System.out.println("computer choice: Rock");
        }
        else if(compnum==1){
            System.out.println("Computer choice :Paper");
        }
        else if(compnum==2){
            System.out.println("Computer choice: Scissor" );
        }
        else{
            System.out.println("Invalid char");
        }

    }
}

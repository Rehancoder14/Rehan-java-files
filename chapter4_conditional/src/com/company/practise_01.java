package com.company;
import java.util.Scanner;
public class practise_01 {
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        float percent = (sub1+sub2+sub3)/3.0f;
        if(sub1> 33 && sub2>33 && sub3>33 && percent>40.0){
            System.out.println("you are pass");
        }
        else{
            System.out.println("You are fail ");
        }


    }
}

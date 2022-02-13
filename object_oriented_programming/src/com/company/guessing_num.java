package com.company;
import  java.util.Scanner;
import java.util.Random;

class guess{
    Scanner sc = new Scanner(System.in);
    Random ran = new Random();
    int n;
    int t;
    public void setdata(){
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        int t = ran.nextInt();
    }
    public void guessnum(){
        while(n!=t){
            System.out.println("Enter number between 1 to 10: ");
            n = sc.nextInt();
        }
        System.out.println("Well guessed!");
    }

}
public class guessing_num {
    public static void main(String []args){
        guess obj = new guess();
        obj.setdata();
        obj.guessnum();
    }
}

package com.company;
import java.util.Scanner;
public class Main {
    int logic(int a, int b){
        if(a<b){
            return a+b;
        }
        else{
            return (a+b)*5;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
//        System.out.println( logic(x,y));
        Main obj = new Main();
        System.out.println(obj.logic(x,y));
    }
}

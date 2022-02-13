package com.company;
import java.util.Scanner;
public class grade_the_steel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            double c = sc.nextDouble();
            int ts = sc.nextInt();
            if(h>50 && c<0.7 && ts>5600){
                System.out.println(10);
            }
            else if (h>50 && c<0.7 ){
                System.out.println(9);
            }
            else if(c<0.7 && ts>5600){
                System.out.println(8);
            }
            else if (h>50 && ts>5600){
                System.out.println(7);
            }
            else if (h>50 || c<0.7 || ts>5600){
                System.out.println(6);
            }
            else{
                System.out.println(5);
            }
        }
    }
}

package com.company;
import java.util.Scanner;
public class hack6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            int grade = sc.nextInt();
            if(grade<38){
                System.out.println(grade);
            }
            else{
                int q = grade/5;
                int rem = q%5;
                if(rem>=3){
                    System.out.println(q*1+5);
                }
                else{
                    System.out.println(grade);
                }
            }
        }
    }
}

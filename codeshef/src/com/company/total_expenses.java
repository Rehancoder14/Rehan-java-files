package com.company;

import java.util.Scanner;

public class total_expenses {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            int n1 = sc.nextInt();
            double num1= (double) n1;
            int n2 = sc.nextInt();
            double num2 = (double) n2;

            if (num1<1000){
                double ans = num1*num2;
                System.out.println(String.format("%.6f", ans));
            }
            else{
                double answer = ((num1*num2)*10.0)/100.0;
                double res = (num1*num2)-answer;
                System.out.println(String.format("%.6f", res));
            }

        }
    }
}

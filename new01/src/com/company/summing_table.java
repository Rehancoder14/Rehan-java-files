package com.company;
import java.util.Scanner;
public class summing_table {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i <11 ; i++) {
            sum +=(n*i);
        }
        System.out.println("sum of the number of 8s multiple "+ sum);
    }
}

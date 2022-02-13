package com.company;
import java.util.Scanner;


public class hack2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean flag = false;
        String a = String.valueOf(n);
        for (int i = 0; i <a.length() ; i++) {
            if (Character.isDigit(a.charAt(i)) == false){
                flag = true;
            }
        }
        if (flag==true){
            System.out.println("Good job");
        }
    }
}

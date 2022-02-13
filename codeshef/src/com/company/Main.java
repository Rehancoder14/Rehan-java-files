package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            boolean flag = false;
            int n = sc.nextInt();
            if (n<=2){
                System.out.println("yes");
            }
            for (int j = 2; j < n; j++) {
                if(n%j==0){
                    System.out.println("no");
                    flag = true;
                    break;
                }
            }
            if (flag==false){
                System.out.println("yes");
            }

        }
    }
}

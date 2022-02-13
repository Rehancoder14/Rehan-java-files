package com.company;
import java.util.Scanner;
public class p1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        for (int i = 0; i < t; i++) {
            if(key==arr[i]){
                System.out.println("The given element is at index "+i);
            }
        }
    }
}

package com.company;
import java.util.Scanner;
public class prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {12,32,423,43,22,64};
        System.out.println("Enter the number to find: ");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== num){
                System.out.println("Given number is present at index "+i);
                break;
            }

        }
    }
}

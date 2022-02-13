package com.company;
import java.util.Scanner;
public class hack1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int alice = 0;
        int bob = 0;
        int arr1[]= new int[3];
        int arr2[]= new int[3];
        for(int i=0;i<3;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<3;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i =0;i<3;i++){
            if(arr1[i]>arr2[i]){
                alice = alice + 1;
            }
            else if(arr1[i]<arr2[i]){
                bob = bob+1;
            }
            else{
                System.out.print("");
            }
        }
        System.out.println(alice+" "+bob);

    }
}

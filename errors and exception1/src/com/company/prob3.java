package com.company;
import java.util.Scanner;
public class prob3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int []arr = new int[5];
        arr[0] = 13;
        arr[1] = 35;
        arr[2] = 34;
        arr[3] = 45;
        arr[4] = 55;
        boolean flag = true;
        int i=0;
        try{
            while(flag && i<5){
                int index = sc.nextInt();
                System.out.println("The value at index "+index+" is "+arr[index]);

            }
        }
        catch(Exception e ){
            i++;
            System.out.println("error");
        }
    }
}

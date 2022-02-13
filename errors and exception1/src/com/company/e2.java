package com.company;

import java.io.IOException;
import java.util.Scanner;
public class e2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int []marks = new int[5];
        marks[0] = 98;
        marks[1] = 90;
        marks[2] = 88;
        marks[3] = 78;
        marks[4] = 68;
        System.out.println("Enter the index of an array ");
        int in = sc.nextInt();
        System.out.println("Enter the number");
        int num = sc.nextInt();
        try{
            System.out.println("The array of the index is "+marks[in]);
            System.out.println("The ans is "+ marks[in]/num);

        }
        catch(ArithmeticException e ){
            System.out.println("arithmetic exception occured");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("some other exception occured ");
            System.out.println(e);
        }

    }
}

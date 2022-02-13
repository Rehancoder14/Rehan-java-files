package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = {98,97,96,92,91};
        System.out.println(marks.length);
        for (int i = marks.length-1; i >=0 ; i--) {
            System.out.println(marks[i]);

        }
        for(int element: marks){
            System.out.println(element);
        }

    }
}

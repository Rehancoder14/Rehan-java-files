package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class prob1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String>l = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            String name = sc.next();
            l.add(name);
        }
        for (String element:
             l) {
            System.out.println(element);
        }
    }
}

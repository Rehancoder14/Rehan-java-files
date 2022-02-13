package com.company;

import java.awt.*;
import java.util.Scanner;

public class reversing_string {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        StringBuilder name = new StringBuilder(sc.nextLine());
        for (int i = 0; i <name.length()/2; i++) {
            int front = i;
            int back = name.length()-1-i;
            char f = name.charAt(front);
            char b = name.charAt(back);
            name.setCharAt(front,b);
            name.setCharAt(back,f);

        }
        System.out.println(name);
    }
}

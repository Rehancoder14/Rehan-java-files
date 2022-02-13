package com.company;
import java.util.Scanner;
public class stringbuilder {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       String sentence = "R";
        for (int i = 0; i < 5; i++) {
            String sent = sc.next();
            sentence = sentence+ sent;
        }
        System.out.println(sentence);
        StringBuilder sb = new StringBuilder("king");
        sb.setCharAt(0,'R');
        System.out.println(sb);
        sb.insert(0,"St");
        System.out.println(sb);
        sb.delete(3,6);
        System.out.println(sb);

    }
}

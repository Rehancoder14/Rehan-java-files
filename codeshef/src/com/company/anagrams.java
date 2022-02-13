package com.company;
import java.util.Scanner;
public class anagrams {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] ch1 = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            ch1[i] = str1.charAt(i);
        }
        char[] ch2 = new char[str1.length()];

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Anagrams");
        }
        else if(!str1.equals(str2)){

        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}

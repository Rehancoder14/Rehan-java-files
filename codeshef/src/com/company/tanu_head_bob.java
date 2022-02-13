package com.company;
import  java.util.Scanner;
import java.lang.String;
public class tanu_head_bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int len = sc.nextInt();
            String gest = sc.next();
//            char[] ch = new char[gest.length()];



            if (gest.contains("I")){
                System.out.println("INDIAN");
            }
            else if(gest.contains("Y")){
                System.out.println("NOT INDIAN");
            }
            else{
                System.out.println("NOT SURE");
            }

            }

        }
    }


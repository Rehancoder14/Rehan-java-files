package com.company;
import java.util.Scanner;
public class time_conversion {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String a = n.substring(0,2);
        int num = Integer.parseInt(a);
        int new_num=0;
        String cut = n.substring(2,8);

        if(n.contains("PM")){
            new_num = num+12;
        }
        String s = Integer.toString(new_num);
        System.out.println(s+cut);

    }
}

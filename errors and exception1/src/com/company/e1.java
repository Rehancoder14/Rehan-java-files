package com.company;

public class e1 {
    public static void main(String []args){
        int a = 45;
        int b =0;
        try {
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println("it is infinity");
            System.out.println(e);
        }

    }
}

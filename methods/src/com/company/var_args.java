package com.company;

public class var_args {
    static int addnum(int ...arr){
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String [] args){
        System.out.println(addnum(12,32,423,43,212));
        System.out.println(addnum(12,12,12));
        System.out.println(addnum());
    }
}

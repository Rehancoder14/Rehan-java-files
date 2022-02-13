package com.company;

public class prob2 {
    static int add(int a,  int b){
        return a/b;
    }
    public static void main(String[] args) {
        try{
            System.out.println(add(12,0));
        }
        catch (ArithmeticException e){
            System.out.println("hehe");
        }
        catch (IllegalArgumentException e){
            System.out.println("haha");
        }
    }
}

package com.company;

public class throws_throw {
    public static int divide(int a, int b)throws ArithmeticException{
        int c = a/b;
        return c;
    }
    public static void main(String[] args) {
        try{
            System.out.println(divide(10,0));
        }
        catch(Exception e){
            System.out.println("Can't divide by zero! ");
        }
    }
}

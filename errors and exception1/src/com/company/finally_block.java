package com.company;

public class finally_block {
    public static int div(int a, int b){
        try{

            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("End of the program ");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(div(5,0));

    }
}

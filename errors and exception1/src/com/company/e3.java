package com.company;

import java.util.Scanner;

class myexception extends  Exception{
    @Override
    public String toString() {
        return " I am toString ";
    }

    @Override
    public String getMessage() {
        return  " I am  getmessage ";
    }

}
public class e3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if (a < 8) {
            try{
                throw new myexception();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}

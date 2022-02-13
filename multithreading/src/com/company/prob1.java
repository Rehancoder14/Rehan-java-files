package com.company;
class a extends Thread{
    public void run(){
        while(true){
            System.out.println("good morning rehan");
        }
    }
}
class b extends Thread{
    public void run(){
        while(true){

            System.out.println("welcome");
        }
    }
}
public class prob1 {
    public static void main(String[]args){
        a a1 = new a();
        a1.setPriority(6);
        b b1 = new b();
        b1.setPriority(9);
        a1.start();
        b1.start();
    }
}

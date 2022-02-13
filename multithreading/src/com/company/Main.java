package com.company;
class mythread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("i am running");
            System.out.println("i am happy");
        }
    }
}
class mythread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("thread2 is good");
            System.out.println("i am starving for knowledge");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();
        t1.start();
        t2.start();
    }
}

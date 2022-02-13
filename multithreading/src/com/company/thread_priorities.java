package com.company;
class mythread11 extends Thread{
    public  mythread11(String name){
        while(true){
            System.out.println("My favourite player is "+name);
        }
    }
}
public class thread_priorities {
    public static void main(String []args){
        mythread11 m1 = new mythread11("virat");
        mythread11 m2 = new mythread11("Rohit");
        mythread11 m3 = new mythread11("Rahul");
        mythread11 m4 = new mythread11("Bumrah");
        mythread11 m5 = new mythread11("Steve smith");
        m3.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();

    }
}

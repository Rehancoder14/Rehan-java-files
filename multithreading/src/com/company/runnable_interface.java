package com.company;
class threadrun1 implements Runnable{
    public void run(){
        System.out.println("I am a thread ");
    }
}
class threadrun2 implements Runnable{
    public void run(){
        System.out.println("I am a thread 2");
    }
}
public class runnable_interface {
    public static void main(String[]args){
        threadrun1 t1 = new threadrun1();
        Thread g1 = new Thread(t1);

        threadrun2 t2 = new threadrun2();
        Thread g2  = new Thread(t2);
        g1.start();
        g2.start();
    }
}

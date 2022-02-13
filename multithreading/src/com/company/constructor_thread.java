package com.company;
class myth extends Thread{
    public myth(String name){
        super(name);

    }
    int i =0;
    public void run(){
        System.out.println("i am a thread of the class myth");
    }
}
public class constructor_thread {
    public static void main(String []args){
        myth t1 = new myth("RehanMahat");
        t1.start();
        System.out.println("The id of the thread is "+t1.getId());
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
        System.out.println(t1.getThreadGroup());
        System.out.println(t1.getStackTrace());


    }
}

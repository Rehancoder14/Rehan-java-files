package com.company;
abstract class base{
    public base(){
        System.out.println("I am constructor of class base...");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class derive extends base{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}
public class Main {

    public static void main(String[] args) {
        derive b = new derive();
        b.greet();
    }
}

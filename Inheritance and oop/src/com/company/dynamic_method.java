package com.company;
class One{
    public void greet(){
        System.out.println("Good Morning...");
    }
    public void name(){
        System.out.println("My name is Rehan.");
    }
}
class two extends One{
    public void wlc(){
        System.out.println("Welcome to Rehan World of coding. ");
    }
    public void name(){
        System.out.println("My name is Rehan in class two..");
    }
}

public class dynamic_method {
    public static void main(String[]args){
//        One a = new One();
//        a.name();
        One a = new two();
        a.name();
        a.greet();

    }
}

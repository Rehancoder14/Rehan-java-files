package com.company;
abstract class pen{
    abstract void write();
    abstract void refill();
}
class pen1 extends pen{
    void write(){
        System.out.println("Writing....");
    }
    void refill(){
        System.out.println("refillling....");
    }
    void changnib(){
        System.out.println("changing the nib....");
    }
}
public class prob1 {
    public static void main(String[]args){
        pen1 p = new pen1();
        p.write();
        p.refill();
        p.changnib();

    }
}

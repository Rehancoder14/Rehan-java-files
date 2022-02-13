package com.company;
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smarttelephone extends Telephone{
    public void ring(){
        System.out.println("ringing");
    }
    public void lift(){
        System.out.println("lifting the call..");
    }
    public void disconnect(){
        System.out.println("disconnecting...");
    }
}

public class prob3 {
    public static void main(String[]args){
        smarttelephone sm = new smarttelephone();
        sm.ring();
        sm.lift();
        sm.disconnect();
    }
}

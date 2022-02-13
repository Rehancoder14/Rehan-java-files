package com.company;
class cellphone{
    public void ringing(){
        System.out.println("ringing.....");
    }
    public void vibrating(){
        System.out.println("vibrating......");
    }
}
public class prob1 {
    public static void main(String[] args){
        cellphone iphone = new cellphone();
        iphone.ringing();
        iphone.vibrating();
    }
}

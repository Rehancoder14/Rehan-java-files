package com.company;
class base{
    int x;
    public void setx(int x){
        System.out.println("I am setting x now");
        this.x = x;

    }
    public int getx(){

        return x;
    }
    public void printme(){
        System.out.println("I am Constructor...");
    }
}
class derived extends base{
    int y;
    public void sety(int y){
        this.y = y;

    }
    public int gety(){
        return y;
    }

}
public class Main {
    public static void main(String[] args) {
        base b = new base();
        b.setx(14);
        System.out.println(b.getx());
    }
}

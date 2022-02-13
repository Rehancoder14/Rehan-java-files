package com.company;
class bas{
    bas(){
        System.out.println("I am base class constructor...");
    }
    bas(int a){
        System.out.println("Overloaded constructor "+a);
    }

    int x;
    public void setx(int x){
        this.x = x;
    }
    public int getx(){
        return x;
    }
}
class der extends bas{
    der(){
        super();
        System.out.println("I am derived class constructor...");
    }
    der(int b){

        System.out.println("I am an overloaded constructor of derived class "+b);
    }
    int y;
    public void sety(int y){
        this.y = y;
    }
    public int gety(){
        return y;
    }
}
public class cont_inher {
    public static void main(String []args){
        bas b = new bas(14);
        der d = new der(12 );
    }

}

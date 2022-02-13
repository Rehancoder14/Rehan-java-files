package com.company;
interface samint{
    void meth1();
    void meth2();
}
interface samint2 extends samint{
    void meth3();
    void meth4();
}
class child implements samint2{
    public void meth1(){
        System.out.println("Hello");
    }
    public void meth2(){
        System.out.println("My name is Rehan...");
    }
    public void meth3(){
        System.out.println("I am professional coder...");
    }
    public void meth4(){
        System.out.println("I love sufhtf");
    }

}
public class interface_inheritance {
    public static void main(String[]args){
        child c = new child();
        c.meth1();
        c.meth2();
        c.meth3();
        c.meth4();
    }
}

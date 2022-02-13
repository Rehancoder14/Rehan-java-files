package com.company;
class A{
    int a;
    public int reh(){
        return 4;
    }
    public void meth1(){
        System.out.println("I am method 1 of class A ");
    }
}
class B extends A{
    public void meth1(){
        System.out.println("I am method of class B");
    }
    public void meth(){
        System.out.println("I am method 2 of class B ");

    }
}
public class method_overriding {
    public static void main(String[]args){
        A a = new A();
        a.meth1();
        B b = new B();
        b.meth1();
        b.meth();
    }
}

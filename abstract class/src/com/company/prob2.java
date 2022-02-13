package com.company;
interface basic_animal{
    void eat();
    void sleep();
}
class monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("biting...");
    }

}
class Human extends monkey implements basic_animal{
    public void eat(){
        System.out.println("Eating....");
    }
    public void sleep(){
        System.out.println("sleeping...");
    }

}
public class prob2 {
    public static void main(String []args){
        Human h = new Human();
        h.eat();
        h.sleep();
        h.bite();
        h.jump();
    }
}

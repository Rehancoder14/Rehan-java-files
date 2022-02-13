package com.company;
import java.util.Scanner;
import java.util.concurrent.CyclicBarrier;

class Cylinder{
    Scanner sc = new Scanner(System.in);
    int r, h;
    public Cylinder(){
        System.out.println("Enter the value of radius and height: ");
        r = sc.nextInt();
        h = sc.nextInt();
    }
    public float volume(){
        return (2*3.14f*r*r*h);
    }
    public float surface_area(){
        return ((2*3.14f*r*h)+(2*3.14f*r*r));
    }

}
public class practise_2 {
    public static void main(String []args){
        Cylinder c = new Cylinder();
        System.out.println("volume of cylinder is "+ c.volume());
        System.out.println("surface area of cylinder is "+ c.surface_area());

    }
}

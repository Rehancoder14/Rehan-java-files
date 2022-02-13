package com.company;
import java.util.Scanner;
class cylinder{
    int radius, height;
    public void set_value(int radius, int height){
        this.radius = radius;
        this.height = height;

    }
    public int get_radius(){
        return radius;

    }
    public int get_height(){
        return height;
    }
    public float volume(){
        return (3.14f*radius*radius*height);
    }
    public float surface_area(){
        return ((2*3.14f*radius*height)+(2*3.14f*radius*radius));
    }

}
public class practise_1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int a = sc.nextInt();
        System.out.print("Enter the height: ");
        int b = sc.nextInt();
        cylinder c = new cylinder();
        c.set_value(a, b);
//        System.out.println("The radius of the cylinder is "+c.get_radius()+" and the height of the cylinder is "+c.get_height());
        System.out.println("The volume of cylinder is: "+c.volume());
        System.out.println("The surface area of cylinder is "+c.surface_area());
    }
}

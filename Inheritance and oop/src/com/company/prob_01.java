package com.company;
class circle{
    int r;
    circle(int a){
        this.r = a;
    }
    public int getr(){
        return r;
    }
    public double area_cicle(){
        return (3.142*r*r);
    }


}
class cylinder extends circle{
    int h;
    cylinder(int b){
        super(b);
        this.h = b;
    }
    public int geth(){
        return h;
    }
    public double area_cylinder(){
        return(area_cicle()*h);
    }

}
public class prob_01 {
    public static void main(String[]args){
        circle c = new circle(5);
        System.out.println(c.getr());
        cylinder cy = new cylinder(10);
        System.out.println(cy.geth());
        System.out.println("The area of the circle is "+c.area_cicle());
        System.out.println("The area of the cylinder is "+ cy.area_cylinder());

    }
}

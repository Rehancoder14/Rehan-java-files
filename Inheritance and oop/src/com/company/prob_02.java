package com.company;
class rectangle{
    int l,b;
    public void setlb(int l, int b){
        this.l = l;
        this.b = b;
    }
    public int area(){
        return (l*b);
    }
}
class cuboid extends rectangle{
    int h;
    public void seth(int h){
        this.h=h;
    }
    public int vol(){
        return (area()*h);
    }

}
public class prob_02 {
    public static void main(String[] args) {
        cuboid c = new cuboid();
        c.setlb(10,5);
        c.seth(8);
        System.out.println("The area of the rectange is "+c.area());
        System.out.println("The volume of cuboidal is "+c.vol());

    }
}

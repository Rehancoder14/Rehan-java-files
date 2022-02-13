package com.company;
import java.util.Scanner;
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }

}
class rectangle{
    int l, b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);

    }

}
public class prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        square sq = new square();
        System.out.print("Enter your number: ");
        sq.side= sc.nextInt();
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        rectangle rec = new rectangle();
        System.out.print("Enter length: ");
        rec.l = sc.nextInt();
        System.out.print("Enter breadth: ");
        rec.b = sc.nextInt();
        System.out.println(rec.area());
        System.out.println(rec.perimeter());
    }
}

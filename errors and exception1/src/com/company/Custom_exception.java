package com.company;
class myex extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative... ";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}
public class Custom_exception {
    public static double area(int r)throws myex{
        if (r<0){
            throw new myex();
        }
        else{
            return (Math.PI*r*r);
        }
    }
    public static void main(String[] args) {
        try{
            double A = area(-6);
            System.out.println(A);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

package com.company;

public class prob5 {
    static int avg(int ...arr){
        int sum = 0;
        for (int a: arr
             ) {
             sum = sum + a;
        }
       return sum/arr.length;
    }
    public static void main(String[] args) {
        System.out.println(avg(15,25,35,45,65,75 ));

    }
}

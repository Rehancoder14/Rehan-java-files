package com.company;

public class method_overloading {
    int addnum(int x, int y){
        return x+y;
    }
    int addnum(int x, int y, int z){
        return x+y+z;
    }
    static void change(int num[]){
        num[0] = 20;
    }

    public static void main(String []args){
        method_overloading obj = new method_overloading();
        System.out.println(obj.addnum(30,50));
        System.out.println(obj.addnum(13,26,12));
        int arr[]={12,423,4,2,4,23423,2,42};
        change(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

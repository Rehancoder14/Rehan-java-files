package com.company;

import java.util.ArrayList;
class mygen <T>{
    int val =14;
    T t1;
    public  mygen(int val, T t1){
        this.val = val;
        this.t1= t1;
    }
    public void getval(){
        System.out.println(t1);
    }
}
public class generics {
    public static void main(String[]args){
//        ArrayList <Integer> arr = new ArrayList<>();
//        arr.add(14);

        mygen<String> arr = new mygen<>(14,"Rehan");
        arr.getval();


    }
}

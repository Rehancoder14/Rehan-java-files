package com.company;

import java.util.ArrayDeque;

public class Arraydeques {
    public static void main(String []args){
        ArrayDeque<Integer>arr = new ArrayDeque<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(arr.getFirst());

    }
}

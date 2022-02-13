package com.company;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<Integer>();

        for (int i = 0; i <8 ; i++) {
            arr.add(i);
        }
        for (int i = 0; i <8 ; i++) {
            System.out.print(arr.get(i)+"<--");
        }
    }
}

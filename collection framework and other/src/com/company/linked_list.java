package com.company;

import java.util.*;

public class linked_list {
    public static void main(String[]args){
//        ArrayList<Integer> arrli=new ArrayList<>();
        LinkedList<Integer>li=new LinkedList<>();
        LinkedList<Integer>arrli = new LinkedList<>();
        li.add(1111);
        li.add(3333);
        li.add(4444);
        li.add(2222);
        arrli.add(10);
        arrli.add(20);
        arrli.add(30);
        arrli.add(40);
        arrli.add(2,50);
        arrli.addAll(li);
        for (int i = 0; i <arrli.size() ; i++) {
            System.out.print(arrli.get(i)+" ");
        }
    }
}

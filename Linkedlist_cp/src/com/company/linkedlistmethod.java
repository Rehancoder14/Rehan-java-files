package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class linkedlistmethod {
    public static void main(String[] args) {

        LinkedList<Integer>list1 = new LinkedList<>();
        list1.add(5);
        list1.add(4);
        list1.add(3);
        list1.add(2);
        list1.add(1);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        Collections.sort(list1);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

    }
}

package com.company;

import java.util.HashSet;
import java.util.Set;

public class prob5 {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(10);
        h.add(20);
        h.add(50);
        h.add(10);
        h.add(40);
        h.add(20);
        System.out.println(h);
    }
}

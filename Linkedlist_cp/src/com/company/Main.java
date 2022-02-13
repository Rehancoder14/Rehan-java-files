package com.company;
import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {
	LinkedList<Integer>link = new LinkedList<>();
    link.add(4);
    link.add(8);
    link.add(12);
    link.addFirst(2);
    link.addLast(40);
    link.add(2,10);
//    link.remove(2);
    for (int i = 0; i < link.size(); i++) {
        System.out.print(link.get(i)+"->");
        }
    System.out.print("null");

    }
}

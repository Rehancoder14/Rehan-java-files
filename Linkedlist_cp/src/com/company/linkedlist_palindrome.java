package com.company;
import java.util.Collections;
import java.util.LinkedList;
public class linkedlist_palindrome {

    public static void main(String[]args){
        LinkedList<Integer>list = new LinkedList<>();
        LinkedList<Integer>list1 = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list1.addAll(list);
        Collections.reverse(list1);
        if (list1==list){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}

package com.company;

import java.util.LinkedList;
import java.util.Scanner;
public class find_delete_node {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer>list = new LinkedList<>();

        for ( int i = 0; i <20 ; i = i+2) {
            list.add(i);
        }
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        for (int i = 0; i <list.size(); i++) {
            if (key==list.get(i)){
                System.out.println("The key is at index at "+i);
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i)+" ");
        }

    }
}

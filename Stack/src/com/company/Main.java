package com.company;
import java.util.*;

public class Main {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            next = null;
        }
    }
    public static class stack{
        public static node head;
        public static boolean isempty(){
            return head == null;
        }
        public static void push(int data){
            node n = new node(data);
            if(isempty()){
                head=n;
                return ;
            }
            n.next =head;
            head = n;
        }
        public static int pop(){
            if(isempty()){
                return -1;
            }
            int top= head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isempty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        stack st = new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}

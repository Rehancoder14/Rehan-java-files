package com.company;
import java.util.Scanner;
public class lapindrome {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        StringBuilder st = new StringBuilder( sc.next());
        StringBuilder st2 = new StringBuilder(st);

        for (int i = 0; i < st.length()/2; i++) {

            char f = st.charAt(i);
            char b= st.charAt(st.length()-1-i);
            st.setCharAt(i,b);
            st.setCharAt(st.length()-1-i,f);
        }
        if (st.equals(st2)){
            System.out.println("lapindrome");
        }
        else{
            System.out.println("not lapindrome");
        }

    }
}

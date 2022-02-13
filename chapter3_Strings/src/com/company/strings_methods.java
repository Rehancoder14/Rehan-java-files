package com.company;

import java.util.Locale;

public class strings_methods {
    public static void main(String[] args){
        String name = "RehanMahat";
        int value = name.length();
        System.out.println(value);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String nottrim ="     Hello World     ";
        System.out.println(nottrim.trim());
        System.out.println(name.substring(5,8));
        System.out.println(name.replace('a','u'));
        System.out.println(name.startsWith("Reh"));
        System.out.println(name.endsWith("Ma"));
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf("aha",2));
        System.out.println(name.lastIndexOf("t",4));
        System.out.println(name.equals("RehanMahat"));
        System.out.println(name.equalsIgnoreCase("rehan mahat"));


    }
}

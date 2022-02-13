package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_time_Formatter {
    public static void main(String[]args){
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
//        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myd = dt.format(d1);
//        System.out.println(myd);
        System.out.println(myd);
    }
}

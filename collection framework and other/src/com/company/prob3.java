package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class prob3 {
    public static void main(String[]args){

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        DateTimeFormatter d = DateTimeFormatter.ofPattern("H:m:s");
        LocalDateTime d1 = LocalDateTime.now();
        String time = d.format(d1);
        System.out.println(time);
    }
}

package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class Gregorian_calender {
    public static void main(String []args){
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ " "+ c.get(Calendar.MINUTE));
        for (int i = 0; i <10 ; i++) {
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }


    }
}

package com.company;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.Callable;

public class Calender_class {
    public static void main(String []args){
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone().getID());

    }
}

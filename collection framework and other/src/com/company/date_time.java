package com.company;
import java.util.Date;
public class date_time {
    public static void main(String []args){
        Date  d = new Date();
        System.out.println(System.currentTimeMillis()/1000+" sec");
        System.out.println(System.currentTimeMillis()/1000/3600+" min");
        System.out.println(System.currentTimeMillis()/1000/3600/24+ " hours");
        System.out.println(System.currentTimeMillis()/1000/3600/24/365+ " YEARS");
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());
    }
}

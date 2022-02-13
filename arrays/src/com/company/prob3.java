package com.company;

public class prob3 {
    public static void main(String []args){
        int marks [] = {98,97,87,93,87,85,84,74,75,78,98,88};
        int avg;  int sum =0;
        for (int i = 0; i <marks.length; i++) {
            sum = sum + marks[i];

        }
        avg = sum/marks.length;
        System.out.println("The average of the marks in physics is "+ avg );
    }

}

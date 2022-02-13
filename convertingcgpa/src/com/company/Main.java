package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);

            System.out.println("Enter marks: ");
            int marks1= s.nextInt();
            int marks2 = s.nextInt();
            int marks3 = s.nextInt();
            double percent = (marks1+marks2+marks3)/3;
            double cgpa = percent/10;
            System.out.print("The percentage of the student is "+percent);
            System.out.print("The cgpa of the student is "+ cgpa);

    }
}

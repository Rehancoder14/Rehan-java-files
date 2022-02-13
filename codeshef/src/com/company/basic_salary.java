package com.company;
import java.util.Scanner;
public class basic_salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            int sal = sc.nextInt();
            double salary = (double) sal;
            double Hra;
            double DA;
            if (salary<1500){
                Hra = (salary*10.0d)/100.0;
                DA = (salary*90.0d)/100.0;
            }
            else{
                Hra = 500.0d;
                DA = (salary*98)/100;
            }

            System.out.println(salary + Hra+ DA);

        }
    }
}

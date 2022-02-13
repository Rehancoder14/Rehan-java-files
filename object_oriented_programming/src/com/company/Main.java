package com.company;
import java.util.Scanner;
class employee{
    String name;
    int salary;
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

    public void setName() {
        System.out.println("The name of the employee is "+name);
    }
    public void setSalary(){
        System.out.println("The salary of the employee is $"+ salary);
    }
}
public class Main {

    public static void main(String[] args) {
        employee Rehan = new employee();
        Rehan.getName();
        Rehan.getSalary();
        Rehan.name = "Rehan Mahat";
        Rehan.salary = 29873189;
        Rehan.setName();
        Rehan.setSalary();


    }
}
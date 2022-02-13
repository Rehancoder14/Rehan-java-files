package com.company;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file_handling {
    public static void main(String[]args){
        File f = new File("myfile.txt");
        try{
            f.createNewFile();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try {
            FileWriter fw = new FileWriter("myfile.txt");
            fw.write("I am the devil of my world");
            fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }

        }
        catch (Exception e ){
            e.printStackTrace();
        }
    }
}

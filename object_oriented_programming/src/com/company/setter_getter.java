package com.company;
class empl{
    private int id;
    private String namel;
    public void setname(String s){
        namel = s;
    }
    public void setint(int a){
        id = a;
    }
    public String getname(){
        return namel;
    }
    public int getint(){
        return id;
    }

}
public class setter_getter {
    public static void main(String []args){
        empl emp = new empl();
        emp.setname("Rehan");
        emp.setint(1);
        System.out.println(emp.getname()+"\n"+emp.getint());

    }

}

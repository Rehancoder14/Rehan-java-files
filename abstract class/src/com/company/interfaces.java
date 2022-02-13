package com.company;
interface cycle{
    void applybreak(int decrement);
    void speedup(int increment);
    int a = 99;
    int b = 30;
}
class avoncycle implements cycle{
    public void hornblow() {
        System.out.println("lafhoisoihoihfhfhuh...........");
    }
    public void applybreak(int decrement){
        System.out.println("Applying brake......");
    }
    public void speedup(int increment){
        System.out.println("Increasing speed.............");
    }


}
public class interfaces {
    public static void main(String[]args){
        avoncycle obj = new avoncycle();
        System.out.println(obj.a);
        obj.hornblow();
        obj.applybreak(obj.b);

        obj.speedup(obj.a);
    }
}

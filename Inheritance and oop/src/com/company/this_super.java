package com.company;
class bass{
    int x;
    bass(int a){
        this.x = a;
    }
    public int geta(){
        return x;
    }
    public int returnnone(){
        return 1;
    }
}
class derr extends bass{
    derr(int b){
        super(b);
        System.out.println("i am constructor "+ b);
    }
}
public class this_super {
    public static void main(String[] args) {
        bass b = new bass(14);
        System.out.println(b.geta());
        System.out.println(b.returnnone());
        derr d= new derr(12);

    }
}

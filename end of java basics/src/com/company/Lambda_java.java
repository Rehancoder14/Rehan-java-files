package com.company;

@FunctionalInterface
interface cycle{
    void blow1();
}

//class anonydemo implements cycle{
//    public void display(){
//        System.out.println();
//    }
//    public void blow1(){
//        System.out.println("blow........1");
//    }
//    public  void blow2(){
//        System.out.println("blow.........2");
//    }
//}
public class Lambda_java {
    public static void main(String[]args){
//        cycle obj = new cycle() {
//            @Override
//            public void blow1() {
//                System.out.println("blow........1");
//            }
//        };
        cycle c = ()->{
            System.out.println("i am bloww11" );
        };
        c.blow1();


    }
}

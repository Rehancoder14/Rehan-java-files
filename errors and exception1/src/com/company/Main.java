package com.company;
class primenum{
    static boolean isprime(int n) {
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }


            }
        }
        return true;
    }
}

public class Main {

    public static void main(String[] args) {
        primenum a = new primenum();
        int n =100;
        for(int i=1;i<100; i++){
            if (a.isprime(i)){
                System.out.println(i+" ");
            }
            }
        }
    }


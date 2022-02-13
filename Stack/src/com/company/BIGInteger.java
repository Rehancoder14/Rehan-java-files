package com.company;
import java.math.BigInteger;
import java.util.Scanner;
public class BIGInteger {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        BigInteger n = BigInteger.valueOf(num);
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <=num ; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);

    }
}

package com.company;

import java.math.BigInteger;
import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int num = sc.nextInt();
            int zeroes = 0;
            BigInteger n = BigInteger.valueOf(num);
            BigInteger fact = BigInteger.valueOf(1);
            for (int i = 1; i <= num; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            String ans = fact.toString();
            char arr[] = ans.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '0') {
                    zeroes++;
                }
            }

            System.out.println(zeroes);
            System.out.println(fact);
        }
    }
}

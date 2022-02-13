package com.company;

public class prob1 {
    public static void main(String [] args){
        float sum = 0.0f;
        float [] nums = {97.87f,87.32f,74.2f,23.5f,99.45f};
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println("The sum of the floating numbers in array is "+ sum);

    }
}

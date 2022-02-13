package com.company;

public class prob4 {
    public static void main(String []args){
        int [][] mat1 = {{6,5,8},
                          {9,3,7}}   ;
        int [][] mat2 = {{11,15,28},
                          {29,13,7}}   ;
        int [][] result = {{0,0,0},
                          {0,0,0}}   ;

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j]= mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.print("\n");

        }
        for (int i = mat1.length-1; i >=0 ; i--) {
            for (int j = mat2[i].length-1; j >=0 ; j--) {
                System.out.print(result[i][j]+" ");
            }

        }

    }
}

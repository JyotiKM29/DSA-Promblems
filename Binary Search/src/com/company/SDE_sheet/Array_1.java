package com.company.SDE_sheet;


public class Array_1 {
    public static void main(String[] args) {
//        int[][] arr = {
//                {0,1,2,0},
//                {3,4,5,2},
//                {1,3,1,5} };
        int[][] arr = { {0},{1}};
//        int row = arr[0].length;
//        int col = arr.length;
//        System.out.println("Row :" + row);
//        System.out.println("Col :"+ col);
        Display(arr);
        System.out.println("=========================");
        setZeroes(arr);
        Display(arr);

    }
    static void Display(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static public void setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < matrix[0].length; k++) {
                       if(matrix[i][k] != 0){
                           matrix[i][k] = -1;
                       }
                    }
                    for (int k = 0; k < matrix.length; k++) {
                        if(matrix[k][j] != 0){
                            matrix[k][j] = -1;
                        }
                    }

                }
            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}


package com.company;


    public class _2DArrayWithNestedLoop9 {
        public static void main(String[] args) {
            int[][] matrix= {
                    {1,2,3,},
                    {4,5,6},
                    {7,8,9},
                    {0,}
            };

            for (int i =0;i<matrix.length;i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j]);// here we need to use print or it will go to other line
                }
                System.out.println();
            }

        }
    }




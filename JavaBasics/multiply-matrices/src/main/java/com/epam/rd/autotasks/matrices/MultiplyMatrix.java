package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int nmatrix[][]  = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < nmatrix.length; i++){
            for (int j = 0; j < nmatrix[0].length; j++){
                int sum = 0;
                for (int k = 0; k < matrix1[0].length; k++)
                    sum += matrix1[i][k] * matrix2[k][j];
                nmatrix[i][j] = sum;
            }
        }
        return nmatrix;
    }
    public static void main(String[] args) {
        int a[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int b[][] = {
                {7, 8},
                {9, 10},
                {11, 12}
        };
        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}

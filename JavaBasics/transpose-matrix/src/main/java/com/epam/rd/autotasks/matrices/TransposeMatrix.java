package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int tmatrix[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++){
            for (int j = 0; j < matrix.length; j++){
                tmatrix[i][j] = matrix[j][i];
            }
        }
        return tmatrix;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 6, 8, 9},
                {7, -13, 0, -1, 3},
                {3, 82, 11, 15, 4, 7}};

        int[][] result = TransposeMatrix.transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}

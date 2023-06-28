package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int matrix[][] = new int[rows][columns];
        int up = 0, left = 0, counter = 1, i = 0, j = 0;
        int down = rows, right = columns;
        boolean flag = false;
        int maxCounter = (rows * columns) + 1;
        breakpoint:for(;;){
            for (j = left; j < right; j++){
                if(counter >= maxCounter)
                    break breakpoint;
                matrix[i][j] = counter++;
            }
            j -= 1;
            for (i = up + 1; i < down; i++){
                if(counter >= maxCounter) break breakpoint;
                matrix[i][j] = counter++;
            }
            i -= 1;
            for (j = right - 2; j >= left; j--) {
                if(counter >= maxCounter) break breakpoint;
                matrix[i][j] = counter++;
            }
            j += 1;
            for (i = down - 2; i > up; i--){
                if(counter >= maxCounter) break breakpoint;
                matrix[i][j] = counter++;
            }
            i += 1;left++;right--;up++;down--;
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] spiral = Spiral.spiral(5, 5);
        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }
    }
}

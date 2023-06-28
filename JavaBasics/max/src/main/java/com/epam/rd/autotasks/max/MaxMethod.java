package com.epam.rd.autotasks.max;
public class MaxMethod {
    public static int max(int[] values) {
        int maxNumber = values[0];
        for (int m : values){
            if(m > maxNumber)
                maxNumber = m;
        }
        return maxNumber;
    }
}


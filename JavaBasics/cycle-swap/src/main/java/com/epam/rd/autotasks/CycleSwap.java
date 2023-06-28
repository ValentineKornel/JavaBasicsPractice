package com.epam.rd.autotasks;

import java.util.Arrays;
class CycleSwap {
    static void cycleSwap(int[] array) {
        if(array.length == 0)
            return;
        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--)
            array[i] = array[i - 1];
        array[0] = temp;
        }
    static void cycleSwap(int[] array, int shift) {
        if(array.length == 0)
            return;
        for (int i = 0; i < shift;i++)
            CycleSwap.cycleSwap(array);
    }
}
class CycleSwapDemo{
    public static void main(String args[]){

        int arr[] = new int[]{2, 3, 4, 5, 6};
        CycleSwap.cycleSwap(arr);
        System.out.println(Arrays.toString(arr));
        CycleSwap.cycleSwap(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}

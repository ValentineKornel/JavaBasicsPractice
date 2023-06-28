package com.epam.rd.autotasks.arrays;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = null;

        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        //put your code here
        if (array == null)
            return 0;
        int summ = 0;
        for (int i = 0; i < array.length; i++){
            summ += (array[i] % 2 == 0) ? array[i] : 0;
        }
        return summ;
    }
}

package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner in = new Scanner(System.in);
        int currentNumber = 1;
        int maxNumber = -999;
        for(int i = 0;;i++){
            currentNumber = in.nextInt();
            if (i == 0)
                maxNumber = currentNumber;
            if (currentNumber == 0)
                break;
            if (maxNumber < currentNumber & currentNumber != 0)
                maxNumber = currentNumber;
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        System.out.println(max());
    }
}

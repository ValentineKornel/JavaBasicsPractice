package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Use Scanner methods to read input
        int average = 0;
        int counter = 0;
        for(;;){
            int currentNumber = in.nextInt();
            if (currentNumber == 0)
                break;
            average += currentNumber;
            counter++;
        }
        average /= counter;
        System.out.println(average);
    }

}
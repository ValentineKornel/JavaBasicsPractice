package com.epam.rd.autotasks.snail;

import java.util.Scanner;
public class Snail
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int h = in.nextInt();
        int currentPosition = 0;
        int amountOfDayNeeded = 0;
        if (b >= a & a < h)
            System.out.println("Impossible");
        else{
            for(;;){
                amountOfDayNeeded++;
                currentPosition += a;
                if (currentPosition >= h) break;
                currentPosition -= b;
            }
            System.out.println(amountOfDayNeeded);
        }
    }
}

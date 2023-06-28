package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        while(seconds >= 86400){
            seconds -= (seconds / 86400) * 86400;
        }
        int hours = seconds / 3600;
        int minutes = (seconds / 60) - (hours * 60);
        int sec = seconds - (hours * 3600) - (minutes * 60);

        System.out.print(hours + ":");
        if (minutes < 10) System.out.print(0);
        System.out.print(minutes + ":");
        if (sec < 10) System.out.print(0);
        System.out.print(sec);
    }
}

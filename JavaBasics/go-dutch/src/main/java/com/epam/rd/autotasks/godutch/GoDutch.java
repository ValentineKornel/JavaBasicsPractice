package com.epam.rd.autotasks.godutch;

import java.util.Scanner;
public class GoDutch {
    public static void main(String[] args) {
        //Write code here
        Scanner in = new Scanner(System.in);
        int bill;
        int numberOfFriends;
        int everyonesPart;
        bill = in.nextInt();
        if (bill < 0){
            System.out.println("Bill total amount cannot ve negative");
            java.lang.System.exit(0);
        }
        numberOfFriends = in.nextInt();
        if (numberOfFriends <= 0){
            System.out.println("Number of friends cannot be negative or zero");
            java.lang.System.exit(0);
        }
        bill += bill * 0.1;
        everyonesPart = bill / numberOfFriends;
        System.out.println(everyonesPart);
    }
}

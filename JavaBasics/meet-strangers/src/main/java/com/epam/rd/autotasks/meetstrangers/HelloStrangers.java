package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int numberOfStrangers = in.nextInt();
        String ignore = in.nextLine();
        for (int i = 0; i < numberOfStrangers; i++){
            String name = in.nextLine();
            System.out.println("Hello, " + name);
        }
        if (numberOfStrangers == 0){
            System.out.println("Oh, it looks like there is no one here");
        }
        if (numberOfStrangers < 0){
            System.out.println("Seriously? Why so negative?");
        }
    }
}

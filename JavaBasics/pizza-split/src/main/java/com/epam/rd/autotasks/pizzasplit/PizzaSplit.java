package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;
public class PizzaSplit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfPeople, numberOfPieces, numberOfPizzas = 0;
        numberOfPeople = in.nextInt();
        numberOfPieces = in.nextInt();
        boolean ifTherIs = false;
        for(int i = 1;ifTherIs == false;i++){
            if ((numberOfPieces * i) % numberOfPeople == 0){
                numberOfPizzas = i;
                ifTherIs = true;
            }
        }
        System.out.println(numberOfPizzas);
    }
}

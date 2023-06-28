package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double discriminant = (b * b) - (4 * a * c);
        if (discriminant < 0)
            System.out.println("no roots");
        if (discriminant == 0){
            double root;
            root = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println(root);
        }
        if (discriminant > 0){
            double root1, root2;
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println(root1 + " " + root2);
        }
        }
}
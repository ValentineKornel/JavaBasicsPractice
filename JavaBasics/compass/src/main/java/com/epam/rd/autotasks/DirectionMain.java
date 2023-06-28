package com.epam.rd.autotasks;

public class DirectionMain {
    public static void main(String args[]){
        Direction degre = Direction.ofDegrees(180);
        System.out.println(degre);
        System.out.println(Direction.closestToDegrees(75));
        System.out.println(Direction.S.opposite());
        System.out.println(Direction.N.differenceDegreesTo(Direction.E));
    }
}

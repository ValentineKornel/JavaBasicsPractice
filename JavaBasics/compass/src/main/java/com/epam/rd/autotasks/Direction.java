package com.epam.rd.autotasks;

import java.util.Optional;

public enum Direction {
    N(0), NE(45), E(90), SE(135),
    S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }
    private int degrees;
    public static Direction ofDegrees(int degrees) {
        degrees = normalieDegree(degrees);
        for (Direction dir:Direction.values()){
            if (dir.degrees == degrees) return dir;
        }
        return null;
    }
    public static Direction closestToDegrees(int degrees) {
        Direction directionToReturn = null;
        int difference = 360;
        degrees = normalieDegree(degrees);
        for (Direction dir: Direction.values()){
            if (Math.abs(dir.degrees - degrees) <= difference){
                difference = Math.abs(dir.degrees - degrees);
                directionToReturn = dir;
            }
        }
        return directionToReturn;
    }

    public Direction opposite() {
        if(degrees < 180)
            return Direction.ofDegrees(degrees + 180);
        else return Direction.ofDegrees(degrees - 180);
    }

    public int differenceDegreesTo(Direction direction) {
        if (degrees == N.degrees && direction.degrees >= 180)
            return 360 - direction.degrees;
        if (degrees > direction.degrees)
            return Math.abs(degrees - direction.degrees);
        else return Math.abs(direction.degrees - degrees);
    }

    private static int normalieDegree(int degree){
        if (degree > 360){
            while(degree > 360)
                degree -= 360;
        }
        if (degree < 0){
            while (degree < 0)
                degree += 360;
        }
        if (degree == 360)
            degree = 0;
        return degree;
    }
}
